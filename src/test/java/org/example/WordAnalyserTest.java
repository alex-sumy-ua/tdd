package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    @Test
    @DisplayName("Test: Step 7")
    public void reverseStringTest() {
        WordAnalyser worldAnalyser = new WordAnalyser();
        assertAll("String Manipulator",
                () -> assertEquals(new String[]{}, worldAnalyser.findLongestWords("")));//,
                //() -> assertEquals("nature", worldAnalyser.findLongestWords("I love nature")));

    }


}