package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReplacerAndEmptierTest {
ReplacerAndEmptier re;
    @Before
    public void setUp() throws Exception {
        re=new ReplacerAndEmptier();
    }

    @After
    public void tearDown() throws Exception {
        re=null;
    }
    @Test
    public void givenStringShouldReturnReplacedList(){
        List<String> result=re.replaceWord("mrudu",new ArrayList<String>(List.of("Apple","Grape","Melon")));;
        List<String> expected=new ArrayList<String>();
        assertEquals(expected,result);
    }
    @Test
    public void givenStringShouldReturnReplacedLists(){
        List<String> result=re.replaceWord("hello",new ArrayList<String>(List.of("banana","Grape","Melon")));;
        List<String> expected=new ArrayList<String>();
        assertEquals(expected,result);
    }
}