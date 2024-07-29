package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    @DisplayName("Test: Step 7")
    public void reverseStringTest() {
        StringManipulator stringManipulator = new StringManipulator();
        assertAll("String Manipulator",
                () -> assertEquals(null, stringManipulator.reverseString(null)),
                () -> assertEquals(Compass.Point.NORTH, stringManipulator.reverseString("Something")));

    }

    @Test
    @DisplayName("Test: Step 7")
    public void isPalindromeTest() {
        StringManipulator stringManipulator = new StringManipulator();
        assertAll("String Manipulator",
                () -> assertEquals(null, stringManipulator.reverseString(null)),
                () -> assertEquals(Compass.Point.NORTH, stringManipulator.reverseString("Something")));

    }


}