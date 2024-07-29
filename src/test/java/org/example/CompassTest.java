package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    @DisplayName("First test: Step 6")
    public void rotateTest() {
        Compass compass = new Compass();
        assertAll("Grouped Assertions of RIGHT Direction",
                () -> assertEquals(null, compass.rotate(null, null)),

                () -> assertEquals(Compass.Point.NORTH, compass.rotate(Compass.Point.EAST, Compass.Direction.LEFT)),
                () -> assertEquals(Compass.Point.WEST, compass.rotate(Compass.Point.NORTH, Compass.Direction.LEFT)),
                () -> assertEquals(Compass.Point.EAST, compass.rotate(Compass.Point.SOUTH, Compass.Direction.LEFT)),
                () -> assertEquals(Compass.Point.SOUTH, compass.rotate(Compass.Point.WEST, Compass.Direction.LEFT)),

                () -> assertEquals(Compass.Point.SOUTH, compass.rotate(Compass.Point.EAST, Compass.Direction.RIGHT)),
                () -> assertEquals(Compass.Point.EAST, compass.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT)),
                () -> assertEquals(Compass.Point.WEST, compass.rotate(Compass.Point.SOUTH, Compass.Direction.RIGHT)),
                () -> assertEquals(Compass.Point.NORTH, compass.rotate(Compass.Point.WEST, Compass.Direction.RIGHT)));


    }

}