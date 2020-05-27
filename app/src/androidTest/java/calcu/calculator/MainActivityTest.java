package calcu.calculator;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.AllOf.allOf;

/**
 * Created by Khan Desktop on 27-May-20.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void AdditionIntegrationTest() {

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.button9), withText("9"), isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.button7), withText("7"), isDisplayed()));
        appCompatButton7.perform(click());


        ViewInteraction appCompatButtonAdd = onView(
                allOf(withId(R.id.buttonplus), withText("+"), isDisplayed()));
        appCompatButtonAdd.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.button3), withText("3"), isDisplayed()));
        appCompatButton3.perform(click());


        ViewInteraction appCompatButtondot = onView(
                allOf(withId(R.id.buttondot), withText("."), isDisplayed()));
        appCompatButtondot.perform(click());

        ViewInteraction appCompatButton0 = onView(
                allOf(withId(R.id.button0), withText("0"), isDisplayed()));
        appCompatButton0.perform(click());

        ViewInteraction appCompatButtonEqual = onView(
                allOf(withId(R.id.buttonequal), withText("="), isDisplayed()));
        appCompatButtonEqual.perform(click());
    }



        @Test
    public void SubtractionIntegrationTest() {

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.button9), withText("9"), isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.button7), withText("7"), isDisplayed()));
        appCompatButton7.perform(click());


        ViewInteraction appCompatButtonAdd = onView(
                allOf(withId(R.id.buttonminus), withText("-"), isDisplayed()));
        appCompatButtonAdd.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.button8), withText("8"), isDisplayed()));
        appCompatButton8.perform(click());


        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button2), withText("2"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButtonEqual = onView(
                allOf(withId(R.id.buttonequal), withText("="), isDisplayed()));
        appCompatButtonEqual.perform(click());

    }

    @Test
    public void MultiplicationIntegrationTest() {



        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.button5), withText("5"), isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton0 = onView(
                allOf(withId(R.id.button0), withText("0"), isDisplayed()));
        appCompatButton0.perform(click());


        ViewInteraction appCompatButtonAdd = onView(
                allOf(withId(R.id.buttonmultiply), withText("X"), isDisplayed()));
        appCompatButtonAdd.perform(click());



        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button2), withText("2"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButtonEqual = onView(
                allOf(withId(R.id.buttonequal), withText("="), isDisplayed()));
        appCompatButtonEqual.perform(click());

    }




}