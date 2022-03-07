package me.tennanta.models;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static me.tennanta.models.PizzaCategories.*;

public enum Pizzas {

    MARGHERITA("Margherita", SIMPLE_VEG, Toppings.CHEESE),
    CHEESE_N_TOMATO("Cheese n'Tomato", SIMPLE_VEG, Toppings.CHEESE, Toppings.TOMATO),
    FARMHOUSE("Farmhouse", CLASSIC_VEG, Toppings.CHEESE, Toppings.CORN),
    VEG_SUPREME("Veg Supreme", CLASSIC_VEG, Toppings.CHEESE, Toppings.CORN, Toppings.OLIVES),
    MEXICAN_GREEN_WAVE("Mexican Green Wave", EXOTIC_VEG, Toppings.CHEESE, Toppings.JALAPENO, Toppings.CAPSICUM),
    PEPPY_PANEER("Peppy Paneer", EXOTIC_VEG, Toppings.CHEESE, Toppings.JALAPENO, Toppings.CAPSICUM, Toppings.PANEER);

    final String pizza;
    private final PizzaCategories pizzaCategory;
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<Toppings> toppings;

    Pizzas(String pizza, PizzaCategories pizzaCat, Toppings... toppings) {
        this.pizza = pizza;
        this.pizzaCategory = pizzaCat;
        this.toppings = new ArrayList<>(asList(toppings));
    }

    public PizzaCategories getPizzaCategory() {
        return pizzaCategory;
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    /**
     * Really wouldn't do this, but for this simple task I'll do it
     */
    public void setToppings(ArrayList<Toppings> toppings) {
        this.toppings = toppings;
    }
}
