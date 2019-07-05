package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCounterTest {
    WordCounter wc;

    @Before
    public void setUp() throws Exception {
        wc=new WordCounter();
    }

    @After
    public void tearDown() throws Exception {
        wc=null;
    }
    @Test
    public void givenStringShouldReturnOccurrence(){
        HashMap<String,Integer> actual=wc.characterCount("one one@one two three one three one two");
        HashMap<String,Integer> expected=new HashMap<String, Integer>(Map.of("one",5,"two",2,"three",2));
        assertEquals(expected,actual);
    }
    @Test
    public void givenStringShouldReturnOccurrences(){
        HashMap<String,Integer> actual=wc.characterCount("one one@one two*three_one three one two");
        HashMap<String,Integer> expected=new HashMap<String, Integer>(Map.of("one",5,"two",2,"three",2));
        assertEquals(expected,actual);
    }
}