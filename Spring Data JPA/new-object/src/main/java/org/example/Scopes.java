package org.example;

public class Scopes {

    private String name;
    private int count = 0;

    public Scopes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increment() {
        count++;
    }

    @Override
    public String toString() {
        return "Scopes{name='" + name + "', count=" + count + "}";
    }
}
