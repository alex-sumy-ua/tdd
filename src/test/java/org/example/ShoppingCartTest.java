package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    @DisplayName("Test: Step 9")
    public void addItemTest() {
        ShoppingCart sc1 = new ShoppingCart();
        sc1.addItem(null, null);
        ShoppingCart sc2 = new ShoppingCart();
        sc2.addItem("Mirror", 25D);
        ShoppingCart sc3 = new ShoppingCart();
        sc3.addItem("Mirror", 25D);
        sc3.addItem("Desk", 275D);
        assertAll("Dealing with items: adding and total price counting",
                () -> assertEquals( new HashMap<>(), sc1.getItems()),
                () -> assertEquals( Map.of("Mirror", 25D), sc2.getItems()),
                () -> assertEquals(300D, sc3.totalPrice()));
    }

    @Test
    @DisplayName("Test: Step 10")
    public void applyDiscountTest() {
        ShoppingCart sc1 = new ShoppingCart();
        sc1.addItem(null, null);
        ShoppingCart sc4 = new ShoppingCart();
        sc4.addItem("Mirror", 25D);
        sc4.addItem("Desk", 275D);
        assertAll("Dealing with items: applying a discount",
                () -> assertEquals( 0D, sc1.applyDiscount(sc1.totalPrice(), (byte) 50)),
                () -> assertEquals( 150D, sc4.applyDiscount(sc4.totalPrice(), (byte) 50)),
                () -> assertEquals( 30D, sc4.applyDiscount(sc4.totalPrice(), (byte) 90)));
    }



}