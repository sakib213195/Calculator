package calcu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Khan Desktop on 12-Oct-19.
 */
public class EngineTest {

    public static final double uncertainity = 0.001; //difference between expected and actual that
                                                     //is acceptable

    @Test
    public void add() throws Exception {
        double n1 = 5.1;
        double n2 = 4.9;
        double expected = 10;

        double actual = Engine.Add(n1,n2);
        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void sub() throws Exception {
        double n1 = 5.5;
        double n2 = 3;
        double expected = 2.5;
        double actual = Engine.Sub(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void mul() throws Exception {
        double n1 = 2;
        double n2 = 3;
        double expected = 6;
        double actual = Engine.Mul(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void div() throws Exception {
        double n1=64;
        int n2 = 8;
        double expected = 8.00000;
        double actual = Engine.Div(n1,n2);

        assertEquals(expected, actual,uncertainity);
    }

}