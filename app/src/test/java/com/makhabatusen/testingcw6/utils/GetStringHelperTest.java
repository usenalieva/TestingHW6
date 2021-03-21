package com.makhabatusen.testingcw6.utils;

import android.content.Context;

import com.makhabatusen.testingcw6.R;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertArrayEquals;

public class GetStringHelperTest {
    GetStringHelper helper;

    @Before
    public void setUp() {
        Context mockContext = Mockito.mock(Context.class);
        Mockito.when(mockContext.getString(R.string.words)).thenReturn("One Two");
        helper = new GetStringHelper(mockContext);
    }

    @Test
    public void testGetString() {
        String[] res = {"One", "Two"};
        assertArrayEquals(res, helper.getString(R.string.words));
    }

    @After
    public void clear() {
        helper = null;
    }
}