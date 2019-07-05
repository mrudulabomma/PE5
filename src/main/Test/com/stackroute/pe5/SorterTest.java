package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class SorterTest {
    Sorter s;

    @Before
    public void setUp() throws Exception {
        s=new Sorter();
    }

    @After
    public void tearDown() throws Exception {
        s=null;
    }
    @Test
    public void givenListShouldreturnSortedSet(){
     HashSet<String> set=new HashSet<String>();
     set.add("harry");
     set.add("alice");
     set.add("bruto");
     set.add("olive");

        List<String> expected=new ArrayList<String>();
        expected.add("alice");
        expected.add("bruto");
        expected.add("harry");
        expected.add("olive");
        assertEquals(expected,s.sortTheSet(set));
    }
    @Test
    public void givenListShouldreturnSortedSets(){
        HashSet<String> set=new HashSet<String>();
        set.add("harry");
        set.add("halice");
        set.add("bruto");
        set.add("olive");

        List<String> expected=new ArrayList<String>();
        expected.add("bruto");
        expected.add("halice");
        expected.add("harry");
        expected.add("olive");
        assertEquals(expected,s.sortTheSet(set));
    }
}