package com.wagnod.contacts

import android.app.Activity
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class SearchTest {
    private lateinit var activity: Activity
    private lateinit var contactAdapter: UserAdapter
    private val contacts = arrayListOf(
        Contact("Test name", "+79213229220"), Contact("John Tyler", "+79516671380"),
        Contact("Matthew Lynch", "+89645382940"), Contact("Adam Magician", "+65902745208")
    )

    @Before
    fun setup() {
        activity = Robolectric.buildActivity(MainActivity::class.java).create().get()
        contactAdapter = UserAdapter(contacts, activity.applicationContext) {}
    }

    private fun search(str: String) : MutableList<Contact> {
        return contactAdapter.filter.filterResults(str)
    }

    @Test
    fun searchByNameTest() {
        val searchRes = search("Ma")
        assertEquals(
            setOf(
                Contact("Matthew Lynch", "+89645382940"),
                Contact("Adam Magician", "+65902745208")
            ), searchRes.asSequence().toSet()
        )
    }

    @Test
    fun searchByNumberTest() {
        val searchRes = search("+79")
        assertEquals(
            setOf(
                Contact("Test name", "+79213229220"),
                Contact("John Tyler", "+79516671380")
            ), searchRes.asSequence().toSet()
        )
    }

    @Test
    fun searchNoValidTest() {
        val searchRes = search("Hello")
        assertEquals(arrayListOf<Contact>(), searchRes)
    }

    @Test
    fun searchByFullName() {
        val searchRes = search("Matthew")
        assertEquals(arrayListOf(Contact("Matthew Lynch", "+89645382940")), searchRes)
    }
}