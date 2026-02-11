package com.hibernate.nativeOnce;

//  creating a table in database using this @Entitiy then import
import jakarta.persistence.Entity;

//  @Id annotation marks a field as the primary key to uniquely identify each row in your database table
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int stu_id;
    private String stu_name;
    private String stu_email;
    private int stu_phone;
    private String stu_address;

    //  Generate Setter And Getter

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_email() {
        return stu_email;
    }

    public void setStu_email(String stu_email) {
        this.stu_email = stu_email;
    }

    public int getStu_phone() {
        return stu_phone;
    }

    public void setStu_phone(int stu_phone) {
        this.stu_phone = stu_phone;
    }

    public String getStu_address() {
        return stu_address;
    }

    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
    }
}

