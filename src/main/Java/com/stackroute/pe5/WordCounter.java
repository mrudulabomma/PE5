package com.stackroute.pe5;

import java.util.HashMap;

public class WordCounter {
    public HashMap<String,Integer> characterCount(String inputString)
    {
        //Creating a HashMap containing String as a key and occurrences as  a value

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String result=inputString.replaceAll("[-+.^:,@___<>*?_]"," ");

       String[] words=result.split(" ");
        //checking each word of strArray

        for (String w : words)
        {
            if(wordCountMap.containsKey(w))
            {
                //If word is present in wordCountMap, incrementing it's count by 1

                wordCountMap.put(w, wordCountMap.get(w)+1);
            }
            else
            {
                wordCountMap.put(w, 1);
            }
        }
return wordCountMap;

    }


}
