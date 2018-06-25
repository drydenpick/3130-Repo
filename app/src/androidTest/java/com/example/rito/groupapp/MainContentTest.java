package com.example.rito.groupapp;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainContentTest {

    @Rule
    public ActivityTestRule<MainContentLogin> mcActivityTestRule = new ActivityTestRule<>(MainContentLogin.class);

    @Test
    public void mainContentTest() {
        //button
        onView(withId(R.id.login_submit_button)).check(matches(isClickable()));
        onView(withId(R.id.login_submit_button)).check(matches(withText(R.string.key_Submit)));
        //text fields
        onView(withId(R.id.user_number)).perform(typeText("Email_Address2"));
        onView(withId(R.id.user_pw)).perform(typeText("pw2"));
        //submit forms
        onView(withId(R.id.login_submit_button)).perform(click());
    }
}