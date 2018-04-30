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
    public void sqrt_isCorrect() {
        assertTrue("Is correct", Math.sqrt(9) == 3);
    }
}