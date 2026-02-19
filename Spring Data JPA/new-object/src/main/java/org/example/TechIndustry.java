package org.example;

public class TechIndustry {

    private String name;
    private String domain;

    public TechIndustry(String name, String domain) {
        this.name = name;
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "TechIndustry{" +
                "name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }
}
