package com.example.and3lesson6;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void resultIsVisible() {
        onView(withId(R.id.apply)).perform(click());
        onView(withId(R.id.result)).check(matches(not(isDisplayed())));
    }

    @Test
    public void addTest(){
        onView(withId(R.id.oper1)).perform(typeText("4"));
        onView(withId(R.id.oper2)).perform(typeText("6"));
        onView(withId(R.id.apply)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("10")));
    }

}
