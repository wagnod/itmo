package com.wagnod.contacts

import android.Manifest
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.not_found.*


class MainActivity : AppCompatActivity() {
    val myRequestId = 314
    private lateinit var layout: View
    private lateinit var usersList : ArrayList<Contact>
    private lateinit var userAdapter : UserAdapter
    private var myBroadCastReceiver: BroadcastReceiver? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.recycler_view)
        requestContactsPermissions()
        userAdapter = UserAdapter(usersList, applicationContext) {
            callTo(this@MainActivity, it.phoneNumber)
        }

        val viewManager = LinearLayoutManager(this)
        recycler_view.apply {
            layoutManager = viewManager
            adapter = userAdapter
        }

        myBroadCastReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                val change = intent?.getIntExtra(NOT_FOUND_TAG, 0)
                if (change == 1726) {
                    setNotFoundScreen()
                } else {
                    offNotFoundScreen()
                }
            }
        }
        registerReceiver(myBroadCastReceiver as BroadcastReceiver, IntentFilter("Oops").apply {
            addCategory(Intent.CATEGORY_DEFAULT)
        })
    }

    private fun offNotFoundScreen() {
        not_found.visibility = View.GONE
    }

    private fun setNotFoundScreen() {
        not_found.visibility = View.VISIBLE
    }


    private fun requestContactsPermissions() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS)
            != PackageManager.PERMISSION_GRANTED
        ) {
            Toast.makeText(applicationContext, R.string.contacts_permission_not_available, Toast.LENGTH_SHORT).show()
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_CONTACTS),
                myRequestId
            )
            usersList = arrayListOf()
        } else {
            usersList = fetchAllContacts()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            myRequestId -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    usersList = fetchAllContacts()
                    userAdapter.users = usersList
                    userAdapter.notifyDataSetChanged()
                    Toast.makeText(applicationContext, R.string.contacts_permission_granted, Toast.LENGTH_SHORT).show()
                } else {
                    Snackbar.make(layout, getString(R.string.contacts_permission_denied), Snackbar.LENGTH_LONG).setAction(getString(
                        R.string.ask_to_give)) {
                        ActivityCompat.requestPermissions(this,
                            arrayOf(Manifest.permission.READ_CONTACTS), myRequestId)
                    }.show()
                }
                return
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        val menuItem: MenuItem = menu!!.findItem(R.id.search)
        val searchView: SearchView = menuItem.actionView as SearchView

        searchView.queryHint = "Type here to Search"
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(curRequest: String?): Boolean {
                menuItem.collapseActionView()
                return false
            }

            override fun onQueryTextChange(prefix: String?): Boolean {
                userAdapter.filter.filter(prefix)
                return false
            }
        })

        return true
    }

    override fun onDestroy() {
        unregisterReceiver(myBroadCastReceiver)
        super.onDestroy()
    }

}
