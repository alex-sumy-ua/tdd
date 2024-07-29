package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
        return out.toArray(new String[0]);

    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        if (text.isEmpty() || text.length() == 0) return null;
        int[] letterCounts = new int[26];
        // Normalize the input to lowercase
        text = text.toLowerCase();
        // Iterate over each character in the string
        for (char c : text.toCharArray()) {
            // Check if the character is a letter
            if (c >= 'a' && c <= 'z') {
                // Update the count at the corresponding index
                letterCounts[c - 'a']++;
            }
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (letterCounts[ch - 'a'] > 0) {
                map.put(ch, letterCounts[ch - 'a']);
//                System.out.println("ch=" + ch + "; counter=" + letterCounts[ch - 'a']);
            }
        }
        return map;
    }

}
