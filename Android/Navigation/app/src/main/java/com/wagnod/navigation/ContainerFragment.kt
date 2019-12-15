package com.wagnod.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ContainerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_activity, container, false)
        if (savedInstanceState == null) {
            childFragmentManager.beginTransaction()
                .add(R.id.frag, ContentFragment())
                .commit()
        }
        return view
    }

}