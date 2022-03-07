package me.tennanta.services;

import me.tennanta.models.Crusts;
import me.tennanta.models.Pizzas;
import me.tennanta.models.Toppings;
import me.tennanta.services.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class OrderTest {

    @Test
    public void shouldReturn410_whenMexicanWithCheeseBurstCrustAndCornAndOlivesAreOrdered() {
        Order order = new Order(Pizzas.MEXICAN_GREEN_WAVE, new ArrayList<>(asList(Toppings.CORN, Toppings.OLIVES)), Crusts.CHEESE_BURST);
        double result = order.getPrice();

        Assertions.assertEquals(result, 4.1);
    }

    @Test
    public void shouldReturn220_whenReplacingTomatoOnACheeseNTomatoPizza() {
        Order order = new Order(Pizzas.CHEESE_N_TOMATO, new ArrayList<>(), Crusts.PAN);
        order.replaceTopping(Toppings.TOMATO, Toppings.OLIVES);

        double result = order.getPrice();

        Assertions.assertEquals(2.2, result);
    }
}