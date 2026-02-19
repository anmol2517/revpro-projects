package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Wiring {

    private Student student;
    private Cars car;

    public Wiring() {
    }

    @Autowired
    public Wiring(Student student, Cars car) {
        this.student = student;
        this.car = car;
    }

    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }

    @Autowired
    public void setCar(Cars car) {
        this.car = car;
    }

    public void showDetails() {
        System.out.println("Student Details: " + student);
        System.out.println("Car Details: " + car);
    }
}
