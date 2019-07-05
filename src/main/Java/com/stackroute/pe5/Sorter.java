package com.stackroute.pe5;

import java.util.*;

import java.util.stream.Collectors;
/*class used to sort the given set in ascending order*/
public class Sorter {
    public List<String> sortTheSet(HashSet<String> input){
        TreeSet<String> result=new TreeSet<String>(input);
        Iterator<String> ascSorting = result.iterator();//iterates the set
        List<String> mainList = new ArrayList<String>();
        while(ascSorting.hasNext()) {
            mainList.add(ascSorting.next());//converts set to list
        }
        System.out.println(mainList);

        return mainList;
    }
}
