package me.tennanta.models;

public enum Toppings {
    TOMATO("Tomato", 0.1),
    JALAPENO("Jalapeno", 0.1),
    OLIVES("Olives", 0.2),
    PANEER("Paneer", 0.2),
    CAPSICUM("Capsicum", 0.1),
    CORN("Corn", 0.1),
    CHEESE("Cheese", 0.3);

    final String topping;
    private final double price;

    Toppings(String topping, double price) {
        this.topping = topping;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static boolean isToppingMoreExpensive(Toppings t1, Toppings t2) {
        return t1.price > t2.price;
    }
}
