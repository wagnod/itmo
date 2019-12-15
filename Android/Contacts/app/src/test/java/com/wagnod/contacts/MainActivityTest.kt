package com.wagnod.contacts

import android.app.Activity
import androidx.recyclerview.widget.RecyclerView
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

    lateinit var activity: Activity
    lateinit var contacts: ArrayList<Contact>

    @Before
    fun setupData() {
        contacts = arrayListOf(
            Contact("Test name", "+79213229220"), Contact("John Tyler", "+79516671380"),
            Contact("Matthew Lynch", "+89645382940"), Contact("Adam Magician", "+65902745208")
        )
    }

    @Before
    fun setup() {
        activity = Robolectric.buildActivity(MainActivity::class.java).create().get()
    }

    @Test
    fun recyclerNotNullTest() {
        val recycler: RecyclerView = activity.findViewById(R.id.recycler_view)
        assertNotNull("Recycler View is null", recycler)
    }
}