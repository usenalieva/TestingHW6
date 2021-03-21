package com.makhabatusen.testingcw6.domain;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MathTest {
    private Math math;

    @Before
    public void setUp() {
        math = new Math();
        System.out.println("BEFORE");
    }

    @Test
    public void testAdd() {

        Assert.assertEquals(8.98, math.add(3.9765433, 5), 0.00);
        Assert.assertEquals(5, math.add(2, 3), 0.0);
        Assert.assertEquals(5, math.add(15, -10), 0.0);
        Assert.assertEquals(-4, math.add(-15, 11), 0.0);
        System.out.println("ADD");
    }

    @Test

    public void testSubtract() {
        Assert.assertEquals(24, math.subtract(30, 6), 0.0);
        Assert.assertEquals(24.68, math.subtract(30.67543, 6), 0.0);
        Assert.assertEquals(5, math.subtract(5, 0), 0.0);
        Assert.assertEquals(-5, math.subtract(0, 5), 0.0);
        System.out.println("SUBTRACT");
    }

    @Test

    public void testDivide() {
        Assert.assertEquals(5, math.divide(30, 6), 0.0);
        Assert.assertEquals(19.91, math.divide(30.666, 1.54), 0.0);
        Assert.assertEquals(0, math.divide(5, 0), 0.0);
        System.out.println("DIVIDE");
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(42, math.multiply(7, 6),0.0);
        Assert.assertEquals(18.15, math.multiply(5.26, 3.45),0.0);
        Assert.assertEquals(0, math.multiply(5, 0),0.0);
        Assert.assertEquals(-20, math.multiply(-4, 5),0.0);
        System.out.println("MULTIPLY");
    }



    @Test
    public void testPow() {
        Assert.assertEquals(0.125, math.pow(0.5, 3), 0.0);        Assert.assertEquals(3375, math.pow(15, 3), 0.0);
        Assert.assertEquals(3375, math.pow(15, 3), 0.0);
        System.out.println("POW");
    }


    @Test
    public void testSqrt() {
        Assert.assertEquals(9.49, math.sqrt(90),0.0);
        Assert.assertEquals(5, math.sqrt(25),0.0);
        System.out.println("SQRT");
    }


    @After
    public void clear() {
        math = null;
        System.out.println("CLEAR");
    }
}