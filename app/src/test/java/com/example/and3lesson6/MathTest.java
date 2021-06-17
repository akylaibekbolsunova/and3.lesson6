package com.example.and3lesson6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    Math math;
    @Before
    public void setUp(){
        math = new Math();
        System.out.println("Before");
    }

    @Test
    public void addTest(){
        assertEquals(4, math.add(1,3));
        System.out.println("AddTest");
    }

    @Test
    public void multiplyTest(){
        assertEquals(9, math.multiply(3,3));
        System.out.println("Multiply");
    }

    @Test
    public void divTest(){
        assertEquals(1, math.div(3,3));
        System.out.println("Multiply");
    }

    @Test
    public void minusTest(){
        assertEquals(0, math.minus(3,3));
        System.out.println("Multiply");
    }

    @Test
    public void sqrtTest(){
        assertEquals(16, math.sqrt(4));
        System.out.println("SQRT");
    }

    @After
    public void clearUp(){
        System.out.println("After");
    }
}
