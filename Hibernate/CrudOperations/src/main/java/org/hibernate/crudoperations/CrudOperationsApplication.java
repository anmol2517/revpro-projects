package org.hibernate.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CrudOperationsApplication {

    public static void main(String[] args) {

        SpringApplication.run(CrudOperationsApplication.class, args);
          Scanner sc = new Scanner(System.in);
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();


        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();


        // Create SessionFactory object to open sessions (heavyweight, used once per application)


        // Begin a transaction to perform database operations (commit/rollback later)


/*
        Session : Fetch Employee

        try {
            Employee e2 = ssn.get(Employee.class, 2);
            Employee e3 = ssn.get(Employee.class, 3);

            if (e2 != null) System.out.println("ID 2: " + e2.getEmpFirstName() + " " + e2.getEmpLastName());
            else System.out.println("Employee Id 2 not found");

            if (e3 != null) System.out.println("ID 3: " + e3.getEmpFirstName() + " " + e3.getEmpLastName());
            else System.out.println("Employee Id 3 not found");

        } catch (Exception ex) {
            ex.printStackTrace();
        }


        Session : Update Data

        try {
            txn = ssn.beginTransaction();
            Employee emp5 = ssn.get(Employee.class, 5);
            if (emp5 != null) {
                emp5.setEmpLastName("Singh");
                ssn.merge(emp5);
                txn.commit();
                System.out.println("Employee Id 5 updated successfully");
            } else {
                System.out.println("Employee Id 5 not found");
            }
        } catch (Exception ex) {
            if (txn != null) txn.rollback();
            ex.printStackTrace();
        }


        Session : Delete Data

        try {
            txn = ssn.beginTransaction();
            Employee emp7 = ssn.get(Employee.class, 7);
            if (emp7 != null) {
                ssn.remove(emp7);
                txn.commit();
                System.out.println("Employee Id 7 deleted successfully");
            } else {
                System.out.println("Employee Id 7 not found");
            }
        } catch (Exception ex) {
            if (txn != null) txn.rollback();
            ex.printStackTrace();
        }
*/

        Employee emp1 = new Employee();
        emp1.setEmpFirstName("Akash");
        emp1.setEmpLastName("Kumar");
        emp1.setEmpEmail("akash@gmail.com");

        Employee emp2 = new Employee();
        emp2.setEmpFirstName("Naveen");
        emp2.setEmpLastName("Kumar");
        emp2.setEmpEmail("naveen@gmail.com");

        Employee emp3 = new Employee();
        emp3.setEmpFirstName("Murli");
        emp3.setEmpLastName("Kumar");
        emp3.setEmpEmail("murli@gmail.com");

        Employee emp4 = new Employee();
        emp4.setEmpFirstName("Arpit");
        emp4.setEmpLastName("Kumar");
        emp4.setEmpEmail("arpit@gmail.com");

        Employee emp5 = new Employee();
        emp5.setEmpFirstName("Sohan");
        emp5.setEmpLastName("Kumar");
        emp5.setEmpEmail("sohan@gmail.com");

        Employee emp6 = new Employee();
        emp6.setEmpFirstName("Rohan");
        emp6.setEmpLastName("Kumar");
        emp6.setEmpEmail("rohan@gmail.com");

        Employee emp7 = new Employee();
        emp7.setEmpFirstName("Shyam");
        emp7.setEmpLastName("Kumar");
        emp7.setEmpEmail("shyam@gmail.com");

        Employee emp8 = new Employee();
        emp8.setEmpFirstName("Raju");
        emp8.setEmpLastName("Kumar");
        emp8.setEmpEmail("raju@gmail.com");

        Session ssn =  sessionFactory.openSession();
        Transaction tx = ssn.beginTransaction();

        try{

            ssn.persist(emp1);
            ssn.persist(emp2);
            ssn.persist(emp3);
            ssn.persist(emp4);
            ssn.persist(emp5);
            ssn.persist(emp6);
            ssn.persist(emp7);
            ssn.persist(emp8);
            tx.commit();
            System.out.println("Data - Stored");
        } catch (Exception en) {
            en.printStackTrace();
        }

        try {

            int id = Integer.parseInt(sc.nextLine());
            Employee emp_1 = ssn.find(Employee.class,id);
            Employee emp_2 = ssn.find(Employee.class, id);

            if (emp2 != null) System.out.println("ID 2: " + emp_1.getEmpFirstName() + " " + emp_1.getEmpLastName());
            else System.out.println("Employee Id 2 not found");

            if (emp3 != null) System.out.println("ID 3: " + emp_2.getEmpFirstName() + " " + emp_2.getEmpLastName());
            else System.out.println("Employee Id 3 not found");

        } catch (Exception ex) {
            ex.printStackTrace();
        }


//        Session : Update Data

        try {

            tx = ssn.beginTransaction();
            Employee emp_5 = ssn.find(Employee.class, 5);
            if (emp5 != null) {
                emp5.setEmpLastName("Singh");
                ssn.merge(emp5);
                tx.commit();
                System.out.println("Employee Id 5 updated successfully");
            } else {
                System.out.println("Employee Id 5 not found");
            }
        } catch (Exception ex) {
            if (tx != null) tx.rollback();
            ex.printStackTrace();
        }


//        Session : Delete Data

        try {

            Employee emp_7 = ssn.find(Employee.class, 7);
            if (emp7 != null) {
                ssn.remove(emp7);
                tx.commit();
                System.out.println("Employee Id 7 deleted successfully");
            } else {
                System.out.println("Employee Id 7 not found");
            }
        } catch (Exception ex) {
            if (tx != null) tx.rollback();
            ex.printStackTrace();
        }

        ssn.close();
    }
}

