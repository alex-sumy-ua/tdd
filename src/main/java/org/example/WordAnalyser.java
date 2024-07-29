package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class WordAnalyser {

    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text
        if (text.isEmpty() || text.length() == 0) {
            return null;
        }
        String[] newStr = text.split(" ");
        ArrayList<String> out = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i].length() > max) max = newStr[i].length();
        }
        for (String word : newStr) {
            if (word.length() == max) {
                out.add(word);
            }
        }
//        String[] output = new String[out.size()];
//        for (int i = 0; i < out.size(); i++) {
//            output[i] = out.get(i);
//            }
//
//        return output;

        return out.toArray(new String[0]);

    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == ) {
//
//            }
//        }


        return null;
    }

}
