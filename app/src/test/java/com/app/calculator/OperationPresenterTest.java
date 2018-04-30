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
    public void pow_isCorrect() {
        assertTrue("Is correct", Math.pow(8,2) == 64);
    }
}