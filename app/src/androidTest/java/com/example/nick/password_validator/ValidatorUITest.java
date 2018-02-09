package com.example.nick.password_validator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.app.PendingIntent.getActivity;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ValidatorUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void weakPassword(){
        // Test not strong password
        onView(withId(R.id.editText)).perform(clearText(), typeText("password"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        // Assert equals textView text
        onView(withId(R.id.textView)).check(matches(withText("Not strong")));
    }

    @Test
    public void somewhatStrongPassword(){
        // Test not strong password
        onView(withId(R.id.editText)).perform(clearText(), typeText("Good!"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        // Assert equals textView text
        onView(withId(R.id.textView)).check(matches(withText("Somewhat strong")));
    }

    @Test
    public void strongestPassword(){
        // Test not strong password
        onView(withId(R.id.editText)).perform(clearText(), typeText("Good!123"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        // Assert equals textView text
        onView(withId(R.id.textView)).check(matches(withText("Strongest")));
    }
}
