package org.springboots.bootapionce;


public class Cardetails {

    private String carName;
    private String carCompany;
    private String carColor;
    private int carMileage;
    private int carPrice;

    public Cardetails() {}

    public Cardetails(String carName, String carCompany, String carColor, int carMileage, int carPrice) {
        this.carName = carName;
        this.carCompany = carCompany;
        this.carColor = carColor;
        this.carMileage = carMileage;
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(int carMileage) {
        this.carMileage = carMileage;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Cardetails{" +
                "carName='" + carName + '\'' +
                ", carCompany='" + carCompany + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carMileage=" + carMileage +
                ", carPrice=" + carPrice +
                '}';
    }
}
