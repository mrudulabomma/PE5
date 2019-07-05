package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;
/* class which replaces the first word with given input word and then empties list*/
public class ReplacerAndEmptier {
    public List<String> replaceWord(String word,List<String> input){
        System.out.println(input);
       input.set(0,word);//setting the first element of list to given word
       System.out.println(input);
       if(!input.isEmpty()) {
           input.removeAll(input);//empties list
       }
       return input;
    }
}
