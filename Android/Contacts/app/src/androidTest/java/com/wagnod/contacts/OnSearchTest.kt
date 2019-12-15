package com.wagnod.contacts

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import junit.framework.Assert.assertNotNull
import androidx.test.core.app.ActivityScenario
import androidx.test.rule.GrantPermissionRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Matchers.not
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Before
import org.junit.Rule


@Suppress("DEPRECATION")
@RunWith(AndroidJUnit4::class)
@LargeTest
class OnSearchTest {

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @get:Rule
    var permissionRule = GrantPermissionRule.grant(android.Manifest.permission.READ_CONTACTS)!!

    @Test
    fun notFoundIconVisibleTest() {
        onView(withId(R.id.search))
        assertNotNull(onView(withId(androidx.appcompat.R.id.search_src_text)))
        onView(withId(R.id.search)).perform(click())
        onView(withId(androidx.appcompat.R.id.search_src_text)).perform(typeText("Andrey"))
        onView(withId(R.id.not_found)).check(matches(isDisplayed()))
    }

    @Test
    fun notFoundIconNotVisibleTest() {
        onView(withId(R.id.search))
        assertNotNull(onView(withId(androidx.appcompat.R.id.search_src_text)))
        onView(withId(R.id.search)).perform(click())
        onView(withId(androidx.appcompat.R.id.search_src_text)).perform(typeText("Test"))
        onView(withId(R.id.not_found)).check(matches(not(isDisplayed())))
    }
}