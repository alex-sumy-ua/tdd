package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    @DisplayName("First test: Step 3")
    public void rotateTest() {
        Compass compass = new Compass();
        assertEquals(null, compass.rotate(null, null));
        assertEquals(Compass.Point.NORTH, compass.rotate(Compass.Point.EAST, Compass.Direction.RIGHT));
    }

}