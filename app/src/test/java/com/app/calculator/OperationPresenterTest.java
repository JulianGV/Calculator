package com.app.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class OperationPresenterTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void division_isCorrect() {
        assertEquals(10, 20 / 2);
    }

    @Test(expected=java.lang.ArithmeticException.class)
    public int testDivideByZero(int firstNumber,int secondNumber) {
        return firstNumber / secondNumber;
    }
}