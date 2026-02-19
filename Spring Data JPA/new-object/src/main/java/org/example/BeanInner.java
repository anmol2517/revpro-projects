package org.example;

public class BeanInner {
    private String owner;
    private Student student;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "BeanInner{" +
                "owner='" + owner + '\'' +
                ", student=" + student +
                '}';
    }
}

