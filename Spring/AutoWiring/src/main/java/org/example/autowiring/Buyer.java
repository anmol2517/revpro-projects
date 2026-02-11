package org.example.autowiring;

public class Buyer {
    private Product product;

    public Buyer(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Buyer [product=" + product + "]";
    }
}