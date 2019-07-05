package com.stackroute.pe5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapper {
    public HashMap<String, String> check(HashMap<String, String> input) {
        Set<Map.Entry<String, String>> entries = input.entrySet();
        System.out.println(entries);

        // HashMap's key set
        Set<String> keys = input.keySet();
        System.out.println(keys);

        // HashMap's values
        Collection<String> values = input.values();
        System.out.println(values);

        for (String i : keys) {
            if (input.containsKey(i)) {
                String str = input.get(i);
                input.put(i, "");

                System.out.println(str);
                input.put("val2", str);
                //System.out.println("key: " + i + " value: " + input.get(i));
            }


        }
        return input;
    }
}


