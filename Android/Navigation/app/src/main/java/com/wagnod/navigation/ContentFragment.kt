package com.wagnod.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_launches.view.*

class ContentFragment : Fragment() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.counter = arguments?.getInt(COUNTER) ?: 0
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_launches, container, false)
        with(view) {
            counter.text = (0..this@ContentFragment.counter).joinToString(SEPARATOR)
            button.setOnClickListener {
                requireFragmentManager().beginTransaction()
                    .replace(R.id.frag, ContentFragment().apply {
                        arguments = Bundle().apply {
                            putInt(COUNTER, this@ContentFragment.counter + 1)
                        }
                    }, it.id.toString())
                    .addToBackStack(null)
                    .commit()
            }
        }
        return view
    }

    companion object {
        private const val COUNTER = "counter"
        private const val SEPARATOR = "->"
    }

}