package calcu.calculator;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Khan Desktop on 27-May-20.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityTestRule<MainActivity> MainActivityActivityUITest= new ActivityTestRule<>(MainActivity.class);

    @Test

    public void UIAdditionTestRun() {
        Espresso.onView(withId(R.id.button5)).perform(click());
        Espresso.onView(withId(R.id.buttonplus)).perform(click());
        Espresso.onView(withId(R.id.button5)).perform(click());
        Espresso.onView(withId(R.id.buttonequal)).perform(click());
        Espresso.onView(withId(R.id.buttonC)).perform(click());

    }

    @Test

    public void UISubtractionTestRun() {
        Espresso.onView(withId(R.id.button1)).perform(click());
        Espresso.onView(withId(R.id.buttonminus)).perform(click());
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.buttonequal)).perform(click());
        Espresso.onView(withId(R.id.buttonC)).perform(click());

    }

    @Test

    public void UIMultiplicationTestRun() {
        Espresso.onView(withId(R.id.button3)).perform(click());
        Espresso.onView(withId(R.id.buttonmultiply)).perform(click());
        Espresso.onView(withId(R.id.button4)).perform(click());
        Espresso.onView(withId(R.id.buttonequal)).perform(click());
        Espresso.onView(withId(R.id.buttonC)).perform(click());

    }

    @Test

    public void UIDivisionTestRun() {
        Espresso.onView(withId(R.id.button6)).perform(click());
        Espresso.onView(withId(R.id.buttondivide)).perform(click());
        Espresso.onView(withId(R.id.button3)).perform(click());
        Espresso.onView(withId(R.id.buttonequal)).perform(click());
        Espresso.onView(withId(R.id.buttonC)).perform(click());
    }

    @Test

    public void UITotalAppTestRun() {
        Espresso.onView(withId(R.id.button5)).perform(click());
        Espresso.onView(withId(R.id.buttonplus)).perform(click());
        Espresso.onView(withId(R.id.button5)).perform(click());
        Espresso.onView(withId(R.id.buttonequal)).perform(click());
        Espresso.onView(withId(R.id.buttonC)).perform(click());

        Espresso.onView(withId(R.id.button1)).perform(click());
        Espresso.onView(withId(R.id.buttonminus)).perform(click());
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.buttonequal)).perform(click());
        Espresso.onView(withId(R.id.buttonC)).perform(click());

        Espresso.onView(withId(R.id.button3)).perform(click());
        Espresso.onView(withId(R.id.buttonmultiply)).perform(click());
        Espresso.onView(withId(R.id.button4)).perform(click());
        Espresso.onView(withId(R.id.buttonequal)).perform(click());
        Espresso.onView(withId(R.id.buttonC)).perform(click());

        Espresso.onView(withId(R.id.button6)).perform(click());
        Espresso.onView(withId(R.id.buttondivide)).perform(click());
        Espresso.onView(withId(R.id.button3)).perform(click());
        Espresso.onView(withId(R.id.buttonequal)).perform(click());
        Espresso.onView(withId(R.id.buttonC)).perform(click());


    }

    @Test
    public void EspressoUIFunctions(){
        UIAdditionTestRun();
        UISubtractionTestRun();
        UIMultiplicationTestRun();
        UIDivisionTestRun();
        UITotalAppTestRun();

    }

}

