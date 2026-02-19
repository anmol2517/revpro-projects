package org.springboots.bootsthrice;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String empName;
    private String empDept;
    private String empWorkLocation;
    private String empRole;
    private int empSalary;


    public Employee(int empId, String empName, String empDept, String empWorkLocation, String empRole, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empWorkLocation = empWorkLocation;
        this.empRole = empRole;
        this.empSalary = empSalary;
    }

    public Employee() {}

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getEmpWorkLocation() {
        return empWorkLocation;
    }

    public void setEmpWorkLocation(String empWorkLocation) {
        this.empWorkLocation = empWorkLocation;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empWorkLocation='" + empWorkLocation + '\'' +
                ", empRole='" + empRole + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
