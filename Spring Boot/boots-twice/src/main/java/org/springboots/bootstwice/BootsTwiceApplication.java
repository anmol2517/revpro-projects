package org.springboots.bootstwice;

import org.springboots.bootstwice.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class BootsTwiceApplication {

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(BootsTwiceApplication.class, args);

        StudentRepo bean = run.getBean(StudentRepo.class);

        Student st1 = new Student();
        st1.setName("baburao");
        st1.setAddress("Pune");

        Student st2 = new Student();
        st2.setName("ganpatrao");
        st2.setAddress("Hyderabad");

        Student st3 = new Student();
        st3.setName("atmaram tukaram bhide");
        st3.setAddress("Mumbai");

        Student st4 = new Student();
        st4.setName("ven gopal iyer");
        st4.setAddress("TamilNadu");

        Student st5 = new Student();
        st5.setName("punjab da puttr");
        st5.setAddress("Punjab");
/*
        Student save1 = bean.save(st1);
        Student save2 = bean.save(st2);
        Student save3 = bean.save(st3);
        Student save4 = bean.save(st4);
        Student save5 = bean.save(st5);

        System.out.println("save1 : " + save1);
        System.out.println("save2 : " + save2);
        System.out.println("save3 : " + save3);
        System.out.println("save4 : " + save4);
        System.out.println("save5 : " + save5);
*/

        List<Student> alldata = List.of(st1, st2, st3, st4, st5);
        Iterable<Student> saveAll = bean.saveAll(alldata);
        saveAll.forEach(System.out::println);


        bean.deleteById(st5.getId());
        System.out.println("Student 5 Details Deleted!");

    }

}

