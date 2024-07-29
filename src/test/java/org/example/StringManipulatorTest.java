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
                () -> assertEquals("", stringManipulator.reverseString("")),
                () -> assertEquals("ADUCARRAB", stringManipulator.reverseString("BARRACUDA")));

    }

    @Test
    @DisplayName("Test: Step 7")
    public void isPalindromeTest() {
        StringManipulator stringManipulator = new StringManipulator();
        assertAll("String Manipulator",
                () -> assertEquals(true, stringManipulator.isPalindrome("")),
                () -> assertEquals(false, stringManipulator.isPalindrome("VOVEL")),
                () -> assertEquals(true, stringManipulator.isPalindrome("ABBA")));

    }


}