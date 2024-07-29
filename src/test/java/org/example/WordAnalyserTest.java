package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    @Test
    @DisplayName("Test: Step 8")
    public void reverseStringTest() {
        WordAnalyser worldAnalyser = new WordAnalyser();
        assertAll("String Manipulator",
                () -> assertEquals(null, worldAnalyser.findLongestWords("")),
                () -> assertEquals(true, Arrays.equals(new String[]{"nature"}, worldAnalyser.findLongestWords("I love nature"))));

    }


}