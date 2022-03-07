package me.tennanta.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToppingsTest {

    @Test
    public void shouldReturnTrue_whenCheeseIsComparedToTomatoes() {
        boolean result = Toppings.isToppingMoreExpensive(Toppings.CHEESE, Toppings.TOMATO);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalse_whenTomatoIsComparedToCheese() {
        boolean result = Toppings.isToppingMoreExpensive(Toppings.TOMATO, Toppings.CHEESE);
        assertFalse(result);
    }
}