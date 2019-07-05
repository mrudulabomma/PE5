package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class OccurrencerTest {
    Occurrencer o;

    @Before
    public void setUp() throws Exception {
        o=new Occurrencer();
    }

    @After
    public void tearDown() throws Exception {
        o=null;
    }
    @Test
    public void givenStringShouldReturnOccurence(){
        HashMap<String,Boolean> result=o.display(new String[]{"a","b","c","d","a","c","c"});
        HashMap<String,Boolean> expected=new HashMap<String, Boolean>(Map.of("a",true,"b",false,"c",true,"d",false));
assertEquals(expected,result);
    }
    @Test
    public void givenStringShouldReturnOccurences(){
        HashMap<String,Boolean> result=o.display(new String[]{"a","b","c","d","a","c","c","A"});
        HashMap<String,Boolean> expected=new HashMap<String, Boolean>(Map.of("a",true,"b",false,"c",true,"d",false));
        assertEquals(expected,result);
    }
}