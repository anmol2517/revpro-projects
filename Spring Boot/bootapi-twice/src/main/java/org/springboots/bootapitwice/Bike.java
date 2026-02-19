package org.springboots.bootapitwice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bike {

    @Id
    private String bikeName;
    private String bikeColor;
    private String bikeCompany;
    private int bikePrice;
    private int bikeMileage;
    private int bikePurchaseYear;

    public Bike() {}

    public Bike(String bikeName, String bikeColor, String bikeCompany, int bikePrice, int bikeMileage, int bikePurchaseYear) {
        this.bikeName = bikeName;
        this.bikeColor = bikeColor;
        this.bikeCompany = bikeCompany;
        this.bikePrice = bikePrice;
        this.bikeMileage = bikeMileage;
        this.bikePurchaseYear = bikePurchaseYear;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getBikeColor() {
        return bikeColor;
    }

    public void setBikeColor(String bikeColor) {
        this.bikeColor = bikeColor;
    }

    public String getBikeCompany() {
        return bikeCompany;
    }

    public void setBikeCompany(String bikeCompany) {
        this.bikeCompany = bikeCompany;
    }

    public int getBikePrice() {
        return bikePrice;
    }

    public void setBikePrice(int bikePrice) {
        this.bikePrice = bikePrice;
    }

    public int getBikeMileage() {
        return bikeMileage;
    }

    public void setBikeMileage(int bikeMileage) {
        this.bikeMileage = bikeMileage;
    }

    public int getBikePurchaseYear() {
        return bikePurchaseYear;
    }

    public void setBikePurchaseYear(int bikePurchaseYear) {
        this.bikePurchaseYear = bikePurchaseYear;
    }




    @Override
    public String toString() {
        return "Bike{" +
                "bikeName='" + bikeName + '\'' +
                ", bikeColor='" + bikeColor + '\'' +
                ", bikeCompany='" + bikeCompany + '\'' +
                ", bikePrice=" + bikePrice +
                ", bikeMileage=" + bikeMileage +
                ", bikePurchaseYear=" + bikePurchaseYear +
                '}';
    }
}
