package org.example;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Collections {

    private List<String> names;
    private Set<String> cities;
    private Map<String, String> countryCapital;
    private Properties config;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Set<String> getCities() {
        return cities;
    }

    public void setCities(Set<String> cities) {
        this.cities = cities;
    }

    public Map<String, String> getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(Map<String, String> countryCapital) {
        this.countryCapital = countryCapital;
    }

    public Properties getConfig() {
        return config;
    }

    public void setConfig(Properties config) {
        this.config = config;
    }

    public void showCollections() {
        System.out.println("List of Names: " + names);
        System.out.println("Set of Cities: " + cities);
        System.out.println("Map of Country-Capital: " + countryCapital);
        System.out.println("Properties Config: " + config);
    }
}
