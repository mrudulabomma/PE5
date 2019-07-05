package com.stackroute.pe5;

import java.util.HashMap;
/*class used to find occurrence of word in given string array*/
public class Occurrencer {
    int count=0;
    public HashMap<String, Boolean> display(String[] input){
        HashMap<String,Boolean> result=new HashMap<String, Boolean>();
       for(int i=0;i<input.length;i++){
           String word=input[i];
           String wordLowercase=word.toLowerCase();//converts words to lower case
           if(!result.containsKey(wordLowercase))
               result.put(wordLowercase,false);
           else
               result.put(wordLowercase,true);
       }
return result;
    }
}
