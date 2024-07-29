package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    @Test
    @DisplayName("Test: Step 8: part 1")
    public void reverseStringTest() {
        WordAnalyser worldAnalyser = new WordAnalyser();
        assertAll("String Manipulator",
                () -> assertEquals(null, worldAnalyser.findLongestWords("")),
                () -> assertEquals(true, Arrays.equals(new String[]{"nature"}, worldAnalyser.findLongestWords("I love nature"))));

    }

    @Test
    @DisplayName("Test: Step 8: part 2")
    public void calculateLetterFrequencyTest() {
        WordAnalyser worldAnalyser = new WordAnalyser();
        assertAll("String Manipulator",
                () -> assertEquals(null, worldAnalyser.calculateLetterFrequency("")),
                () -> assertTrue(( Map.of('e', 2).get('e')).equals(worldAnalyser.calculateLetterFrequency("I love nature so much").get('e'))),
                () -> assertTrue(( Map.of('e', 2).get('e')).equals(worldAnalyser.calculateLetterFrequency("I love nature so much").get('e'))));

    }


}