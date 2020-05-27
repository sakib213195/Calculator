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


        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.button4), withText("4"), isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.button5), withText("5"), isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.button8), withText("8"), isDisplayed()));
        appCompatButton8.perform(click());




        ViewInteraction appCompatButtonAdd = onView(
                allOf(withId(R.id.buttonplus), withText("+"), isDisplayed()));
        appCompatButtonAdd.perform(click());

        ViewInteraction appCompatButton1 = onView(
                allOf(withId(R.id.button1), withText("1"), isDisplayed()));
        appCompatButton1.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button2), withText("2"), isDisplayed()));
        appCompatButton2.perform(click());


        ViewInteraction appCompatButtonEqu = onView(
                allOf(withId(R.id.buttonequal), withText("="), isDisplayed()));
        appCompatButtonEqu.perform(click());

    }



}