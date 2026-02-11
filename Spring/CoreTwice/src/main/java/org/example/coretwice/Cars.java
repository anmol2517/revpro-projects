package org.example.coretwice;

import java.util.List;
import java.util.Map;

public class Cars {
    private String color;
    private String company;
    private String name;
    private int mileage;
    private int model;

    // List stores an ordered collection of multiple values (import list)
    private List<String> owners;

    // Map stores data in key-value pairs for quick retrieval (import map)
    private Map<String, String> cardetails;
    private Map<String, String> engineDetails;
    private Map<String, String> carMileage;

    // Generate a Setter & Getter Methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public List<String> getOwners() {
        return owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    public Map<String, String> getCardetails() {
        return cardetails;
    }

    public void setCardetails(Map<String, String> cardetails) {
        this.cardetails = cardetails;
    }

    public Map<String, String> getEngineDetails() {
        return engineDetails;
    }

    public void setEngineDetails(Map<String, String> engineDetails) {
        this.engineDetails = engineDetails;
    }

    public Map<String, String> getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(Map<String, String> carMileage) {
        this.carMileage = carMileage;
    }

    // Generate a toString method
    @Override
    public String toString() {
        return "Cars{" +
                "color='" + color + '\'' +
                ", company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", mileage=" + mileage +
                ", model=" + model +
                ", owners=" + owners +
                ", cardetails=" + cardetails +
                '}';
    }

    // Generate Parametrized Constructor
    public Cars(String color, String company, String name, int mileage, int model, List<String> owners, Map<String, String> cardetails) {
        this.color = color;
        this.company = company;
        this.name = name;
        this.mileage = mileage;
        this.model = model;
        this.owners = owners;
        this.cardetails = cardetails;
    }

    // Generate Non-Parametrized Constructor
    public Cars() { }
}

/*
Code Explanation Hindi (Line by Line)

ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
Ye line beans.xml file ko load karti hai aur Spring Container start karti hai jo beans ko manage karta hai.

Cars myCar = (Cars) context.getBean("myCar");
Spring Container se myCar ID wali bean fetch karke use Cars class ke object mein cast karti hai.

for (int i = 0; i < myCar.getOwners().size(); i++) {
Ye loop tab tak chalta hai jitne owners aapne beans.xml ki <list> mein diye hain (yahan 6 owners hain).

String owner = myCar.getOwners().get(i);
List se current index i ke hisaab se owner ka naam (jaise ss, aa) nikalta hai.

String car = myCar.getCardetails().get(owner);
cardetails map mein owner ka naam "key" ki tarah bhej kar uski car ka naam (jaise Mahindra XUV700) nikalta hai.

String engine = myCar.getEngineDetails().get(car);
engineDetails map mein car ka naam "key" ki tarah bhej kar uska engine detail fetch karta hai.

String mileage = myCar.getCarMileage().get(car);
carMileage map mein car ka naam "key" ki tarah bhej kar uska mileage fetch karta hai.

System.out.println(...);
Ye saari information ko ek sundar format mein console par print kar deta hai.

*/


