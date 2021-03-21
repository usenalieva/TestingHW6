package com.makhabatusen.testingcw6.domain;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class WordsTest extends TestCase {
    private Words words;

    @Before
    public void setUp() {
        words = new Words();
    }

    @Test
    public void testReverseWords() {
        assertEquals("Two One", words.reverseWords("One Two"));
        assertEquals("Geektech", words.reverseWords("Geektech"));
        assertEquals("Three Two One", words.reverseWords("One Two Three"));
        assertEquals("", words.reverseWords(null));
    }
}