package com.wagnod.contacts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*
import java.util.*
import kotlin.collections.ArrayList

class UserViewHolder(val root: View) : RecyclerView.ViewHolder(root) {

    val userNameText = root.name
    val userNumberText = root.number
}

const val NOT_FOUND_TAG = "Tag"

class UserAdapter(var users: ArrayList<Contact>, val context : Context, val onClick: (Contact) -> Unit) :
    RecyclerView.Adapter<UserViewHolder>(), Filterable{

    inner class MyFilter : Filter() {
        fun filterResults(constraint: CharSequence?): MutableList<Contact> {
            val searchList = mutableListOf<Contact>()
            if (constraint == null || constraint.isEmpty()) {
                searchList.addAll(userListFull)
            } else {
                val filterPattern: String = constraint.toString().toLowerCase(Locale.ENGLISH).trim()
                for (contact: Contact in userListFull) {
                    if (contact.name.toLowerCase().contains(filterPattern) ||
                        contact.phoneNumber.contains(filterPattern)
                    ) {
                        searchList.add(contact)
                    }
                }
            }
            return searchList
        }

        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val searchList = filterResults(constraint)
            val results = FilterResults()
            results.values = searchList
            return results
        }

        override fun publishResults(p0: CharSequence?, results: FilterResults?) {
            users.clear()
            users.addAll(results?.values as ArrayList<Contact>)
            notifyDataSetChanged()
            isChange = if (users.isEmpty()) {
                1726
            } else {
                0
            }
            showNotFoundPage(isChange)
        }
    }

    override fun getFilter(): MyFilter {
        return MyFilter()
    }

    private var isChange = 0
    private var userListFull: ArrayList<Contact> = ArrayList(users)
    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.userNameText.text = users[position].name
        holder.userNumberText.text = users[position].phoneNumber
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val holder = UserViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.list_item,
                parent,
                false
            )
        )
        holder.root.setOnClickListener { onClick(users[holder.adapterPosition]) }
        return holder
    }


    fun showNotFoundPage(isChange: Int) {
        context.sendBroadcast(Intent().apply {
            action = "Oops"
            addCategory(Intent.CATEGORY_DEFAULT)
            putExtra(NOT_FOUND_TAG, isChange)
        })
    }
}