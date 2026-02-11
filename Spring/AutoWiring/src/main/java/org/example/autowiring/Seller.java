package org.example.autowiring;

public class Seller {
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Seller [product=" + product + "]";
    }
}