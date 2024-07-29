package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class WordAnalyser {

    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text
        if (text.isEmpty() || text.length() == 0) {
            return new String[] {};
        }
        String[] newStr = text.split(" ");
        ArrayList<String> out = new ArrayList<>();
        int[] lengths = new int[text.length()];
        int max = 0;
        for (int i = 0; i < newStr.length; i++) {
            lengths[i] = newStr.length;
            if (newStr.length > max) max = newStr.length;
        }
        for (String word: newStr) {
            if (word.length() == max) out.add(word);
        }
        String[] output = out.toArray(new String[0]);
        return output;
    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        return null;
    }

}
