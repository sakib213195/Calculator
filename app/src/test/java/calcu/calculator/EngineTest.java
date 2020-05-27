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

                        // Input Space Partitioning//

    // inputs values will as follows:
    //both positive
    //both negative
    //positive and negative
    //positive and zero
    //negative and zero
    //zero and zero

    @Test
    public void addbothpos() {
        double n1 = 5;
        double n2 = 5;
        double expected = 10;
        double actual = Engine.Add(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void addbothneg(){
        double n1 = -6;
        double n2 = -10;
        double expected = -16;
        double actual = Engine.Add(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void addposneg(){
        double n1 = 5.65;
        double n2 = -2.5;
        double expected = 3.15;
        double actual = Engine.Add(n1,n2);

        assertEquals(expected,actual,uncertainity);

    }

    @Test
    public void addposzero() {
        double n1=55.656563;
        double n2 = 0;
        double expected = 55.656563;
        double actual = Engine.Add(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void addnegzero() {
        double n1 = -55.656565;
        double n2 = 0;
        double expected = -55.656565;
        double actual = Engine.Add(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public  void addzerozero() {
        double n1 = 0;
        double n2 = 0.0000000000000000;
        double expected = 0;
        double actual = Engine.Add(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void subbothpos() {
        double n1 = 5;
        double n2 = 4;
        double expected = 1;
        double actual = Engine.Sub(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void subbothneg(){
        double n1 = -6;
        double n2 = -15;
        double expected = 9;
        double actual = Engine.Sub(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void subposneg(){
        double n1 = 5.65;
        double n2 = -2.5;
        double expected = 8.15;
        double actual = Engine.Sub(n1,n2);

        assertEquals(expected,actual,uncertainity);

    }

    @Test
    public void subposzero() {
        double n1=9.62;
        double n2 = 0;
        double expected = 9.62;
        double actual = Engine.Sub(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void subnegzero() {
        double n1 = 0;
        double n2 = -0;
        double expected = 0;
        double actual = Engine.Sub(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public  void subzerozero() {
        double n1 = 0;
        double n2 = 0.0000000000000000;
        double expected = 0;
        double actual = Engine.Sub(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void mulbothpos() {
        double n1 = 5;
        double n2 = 5;
        double expected = 25;
        double actual = Engine.Mul(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void mulbothneg(){
        double n1 = -6;
        double n2 = -15;
        double expected = 90;
        double actual = Engine.Mul(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void mulposneg(){
        double n1 = 8.2;
        double n2 = -2.0;
        double expected = -16.40;
        double actual = Engine.Mul(n1,n2);

        assertEquals(expected,actual,uncertainity);

    }

    @Test
    public void mulposzero() {
        double n1=55000;
        double n2 = 0;
        double expected = 0.00;
        double actual = Engine.Mul(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void mulnegzero() {
        double n1 = 0;
        double n2 = -0;
        double expected = 0;
        double actual = Engine.Mul(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public  void mulzerozero() {
        double n1 = 0;
        double n2 = 0.0000000000000000;
        double expected = 0;
        double actual = Engine.Mul(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void divbothpos() {
        double n1 = 6.0;
        double n2 = 3.0;
        double expected = 2.0;
        double actual = Engine.Div(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void divbothneg(){
        double n1 = -98;
        double n2 = -2;
        double expected = 49;
        double actual = Engine.Div(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test
    public void divposneg(){
        double n1 = 5.65;
        double n2 = -2.5;
        double expected = -2.26;
        double actual = Engine.Div(n1,n2);

        assertEquals(expected,actual,uncertainity);

    }

    @Test(expected=java.lang.ArithmeticException.class)
    public void divposzero() throws ArithmeticException
    {
        double n1 = 87;
        double n2 = 0;

        Engine.Div(n1, n2);
    }



    @Test
    public void divnegzero() {
        double n1 = -0;
        double n2 = 5;
        double expected = 0;
        double actual = Engine.Div(n1,n2);

        assertEquals(expected,actual,uncertainity);
    }

    @Test(expected=java.lang.ArithmeticException.class)
    public  void divzerozero() throws ArithmeticException {
        double n1 = 0;
        double n2 = 0.0000000000000000;

         Engine.Div(n1,n2);

    }

}