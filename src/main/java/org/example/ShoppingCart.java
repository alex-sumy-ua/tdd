package org.example;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Double> items = new HashMap<>();
    private final byte MIN_VALUE = 0;
    private final byte MAX_VALUE = 100;

    public ShoppingCart() {
    }

    public Double applyDiscount(Double amount, byte discount) {
        if (discount < 0 || discount > 100)
            throw new IllegalArgumentException("Discount should be more or equal to " + MIN_VALUE +
                                                             " and less or equal to " + MAX_VALUE);
        return (Double) amount * (100 - discount) / 100;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void addItem(String item, Double price) {
        if (item != null && price != null)
            if (price < 0) throw new IllegalArgumentException("Price can't be negative");
            else items.put(item, price);
    }

    public Double totalPrice() {
        double price = 0D;
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            price += entry.getValue();
        }
        return (Double)price;
    }

}
