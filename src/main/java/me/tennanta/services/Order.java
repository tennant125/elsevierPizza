package me.tennanta.services;

import me.tennanta.models.Crusts;
import me.tennanta.models.Pizzas;
import me.tennanta.models.Toppings;

import java.util.ArrayList;

public class Order {

    private final Pizzas pizza;
    private ArrayList<Toppings> additionalToppings;
    private final Crusts crust;

    /**
     * For now, if there are more than two toppings on the pizza just ignore them completely,
     * will work on this later.
     */
    public Order(Pizzas pizza, ArrayList<Toppings> additionalToppings, Crusts crust) {
        this.pizza = pizza;
        if (additionalToppings.size() <= 2) {
            this.additionalToppings = additionalToppings;
        }
        this.crust = crust;
    }

    /**
     * If the price of the toppings are equal, add the topping to the pizza so that it
     * does not cost anything additional. If the replacement topping is more expensive,
     * add to the topping to the additional toppings.
     *
     * @param toReplace the topping the customer wants to replace
     * @param replaceWith the topping the customer wants to be added instead
     * @return simple String message for now
     */
    public String replaceTopping(Toppings toReplace, Toppings replaceWith) {
        ArrayList<Toppings> toppings = pizza.getToppings();
        double priceDif = 0;
        if (toppings.contains(toReplace)) {
            if (toReplace.getPrice() >= replaceWith.getPrice()) {
                toppings.remove(toReplace);
                toppings.add(replaceWith);
                pizza.setToppings(toppings);
            } else {
                toppings.remove(toReplace);
                additionalToppings.add(replaceWith);
                priceDif = replaceWith.getPrice();
            }
            return String.format("The topping of: %s has been replace with %s, for the price of %s. " +
                    "New price of order: %s", toReplace, replaceWith, priceDif, getPrice());
        } else {
            return "You've chosen a Topping that is not on your pizza to replace.";
        }
    }

    /**
     * Simple price calculator, combining the price of all components to the pizza.
     */
    public double getPrice() {
        double pizzaPrice = pizza.getPizzaCategory().getPrice();
        double additionalToppingsPrice = 0;
        for (Toppings topping: additionalToppings) {
            additionalToppingsPrice += topping.getPrice();
        }
        double crustPrice = crust.getPrice();
        return pizzaPrice + additionalToppingsPrice + crustPrice;
    }
}
