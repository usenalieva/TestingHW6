package com.makhabatusen.testingcw6.ui;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.makhabatusen.testingcw6.R;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


public class MainActivityTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void applyClickTest() {
//        onView(withId(R.id.btn_add)).perform(click());
//        onView(withId(R.id.tv_result)).check(matches(not(isDisplayed())));
//        onView(withId(R.id.et_operator_one)).perform(typeText("2"));
//        onView(withId(R.id.et_operator_two)).check(matches(withText("2")));
    }

    @Test
    public void addClickTest2() {
        typeValues("32", "12");
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("44.0")));
    }

    @Test
    public void addClickTest() {
        typeValues("32.5", "12");
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("44.5")));
    }

    @Test
    public void subtractClickTest() {
        typeValues("32.5", "12");
        onView(withId(R.id.btn_subtract)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("20.5")));
    }

    @Test
    public void multiplyClickTest() {
        typeValues("32.5", "12.5645");
        onView(withId(R.id.btn_multiply)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("408.35")));
    }


    @Test
    public void divideClickTest() {
        typeValues("36", "11");
        onView(withId(R.id.btn_divide)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("3.27")));
    }


    @Test
    public void powTest() {
        typeValues("3", "3");
        onView(withId(R.id.btn_pow)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("27.0")));
    }

    @Test
    public void powTest2() {
        typeValues("3.5", "3");
        onView(withId(R.id.btn_pow)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("42.875")));
    }


    @Test
    public void sqrtTest() {
        onView(withId(R.id.et_operator_one)).perform(typeText("90"));
        onView(withId(R.id.btn_sqrt)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("9.49")));
    }


    private void typeValues(String s, String s2) {
        onView(withId(R.id.et_operator_one)).perform(typeText(s));
        onView(withId(R.id.et_operator_two)).perform(typeText(s2));
    }


}