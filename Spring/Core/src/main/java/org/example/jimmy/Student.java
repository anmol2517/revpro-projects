package org.example.jimmy;

// POJO class: Plain Old Java Object

public class Student {

    // 1. Instance variables (data members)
    // These variables store student details

    private String name;
    private int roll;
    private String city;

    // Default Constructor because Spring use through making object (Setter Injection compulsory)

    public Student() {}

    // Constructor
    // Used to initialize the object at the time of creation
    public Student(String name, int roll, String city) {
        this.name = name;   // assigns parameter value to instance variable
        this.roll = roll;
        this.city = city;
    }

    //  Getter methods
    //  Used to access private variables outside the class

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getCity() {
        return city;
    }

    //  Setter methods
    //  Used to modify private variables outside the class

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setCity(String city) {
        this.city = city;
    }


    // toString() method
    // Used to print object data in readable format

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", roll = " + roll +
                ", city = '" + city + '\'' +
                '}';
    }
}
