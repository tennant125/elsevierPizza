package me.tennanta.models;

public enum Crusts {

    PAN("Pan", 0),
    THIN("Thin", 0.4),
    CHEESE_BURST("Cheese Burst", 0.8);

    final String crust;
    private final double price;

    Crusts(String crust, double price) {
        this.crust = crust;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
