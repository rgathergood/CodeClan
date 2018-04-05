package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/03/2018.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter();
    }

    @Test
    public void emptyStringPassed() {
        assertEquals("{}", wordCounter.countWords(" "));
    }

    @Test
    public void StringOfTextTest() {
        assertEquals("{world=1, hello=1}",wordCounter.countWords("Hello World!"));
    }
}
