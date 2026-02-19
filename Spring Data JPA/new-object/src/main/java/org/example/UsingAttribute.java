package org.example;

public class UsingAttribute {
    private Student student;
    private Cars car;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Cars getCar() {
        return car;
    }

    public void setCar(Cars car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "UsingAttribute{" +
                "student=" + student +
                ", car=" + car +
                '}';
    }
}
