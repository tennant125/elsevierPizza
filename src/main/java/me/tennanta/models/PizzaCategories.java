package me.tennanta.models;

public enum PizzaCategories {

    SIMPLE_VEG("Simple Veg", 2),
    CLASSIC_VEG("Classic Veg", 2.5),
    EXOTIC_VEG("Exotic Veg", 3);

    final String catName;
    private final double price;

    PizzaCategories(String catName, double price) {
        this.catName = catName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
