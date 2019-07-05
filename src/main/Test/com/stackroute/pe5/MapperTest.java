package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapperTest {
    Mapper m;

    @Before
    public void setUp() throws Exception {
        m=new Mapper();
    }

    @After
    public void tearDown() throws Exception {
        m=null;
    }
    @Test
    public void check(){
        HashMap<String,String> actual=m.check(new HashMap<>(Map.of("val1","java","val2","c++")));
        HashMap<String,String> expected=new HashMap<>();
        expected.put("val1","");
        expected.put("val2","java");
        assertEquals(expected,actual);
    }
}