package com.hibernate.nativeOnce;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NativeOnceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(NativeOnceApplication.class, args);

        SessionFactory sfy = context.getBean(SessionFactory.class);  //  Used to create Hibernate Sessions
        Session ss = sfy.openSession();         //  Represents a single unit of work with the database
        Transaction tx = ss.beginTransaction();      //  Manages the database transaction for commit or rollback

        try {
            Student s1 = new Student();
            s1.setStu_id(111);
            s1.setStu_name("BabuRao");
            s1.setStu_email("baburao@star.com");
            s1.setStu_phone(987654321);
            s1.setStu_address("Mumbai");

            Student s2 = new Student();
            s2.setStu_id(222);
            s2.setStu_name("Jethalal");
            s2.setStu_email("jetha@gada.com");
            s2.setStu_phone(123456789);
            s2.setStu_address("Gokuldham");

            Student s3 = new Student();
            s3.setStu_id(333);
            s3.setStu_name("AtmaRam TukaRam Bhide");
            s3.setStu_email("bhide@society.com");
            s3.setStu_phone(112233445);
            s3.setStu_address("Ratnagiri");

            Student s4 = new Student();
            s4.setStu_id(444);
            s4.setStu_name("Ganpat Rao");
            s4.setStu_email("ganpat@rao.com");
            s4.setStu_phone(556677889);
            s4.setStu_address("Pune");

            Student s5 = new Student();
            s5.setStu_id(555);
            s5.setStu_name("Raju");
            s5.setStu_email("raju@paisa.com");
            s5.setStu_phone(998877665);
            s5.setStu_address("Dharavi");

            ss.persist(s1);
            ss.persist(s2);
            ss.persist(s3);
            ss.persist(s4);
            ss.persist(s5);

            tx.commit();            //  Commit transaction
        } catch (Exception e) {
            tx.rollback();          //  Rollback if error occurs
            e.printStackTrace();
        } finally {
            ss.close();            //   Close session
        }
    }
}

