package com.example.user.wordcounter;
import java.util.HashMap;

/**
 * Created by user on 19/03/2018.
 */

public class WordCounter {

    private HashMap<String, Integer> countedWords;

    public WordCounter() {
        countedWords = new HashMap<>();
    }

    public String countWords(String inputText) {
        String[] words = inputText.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "").toLowerCase();
            if (countedWords.containsKey(words[i]) == true) {
                int firstCount = countedWords.get(words[i]);
                int secondCount = firstCount + 1;
                countedWords.put(words[i], secondCount);
            } else {
                countedWords.put(words[i], 1);
            }
        }
        return countedWords.toString();
    }
}


//    //Old MVP method
//    public int countWords(String stringOfText){
//        if (stringOfText == null || stringOfText.isEmpty())
//            return 0;
//        else
//            return stringOfText.split("\\s+").length;
//    }
