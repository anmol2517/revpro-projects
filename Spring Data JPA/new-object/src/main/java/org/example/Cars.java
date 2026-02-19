package org.example;

public class Cars {
    private String company;
    private String car_name;

    public Cars() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "company='" + company + '\'' +
                ", car_name='" + car_name + '\'' +
                '}';
    }
}
