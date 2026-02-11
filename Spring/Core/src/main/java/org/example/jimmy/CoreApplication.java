package org.example.jimmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(CoreApplication.class, args);


        //  Load the beans.xml file from resources folder

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 2 dependency add (spring core or spring context)

        //  Get the student object from Spring container using bean id

        Student std1 = (Student) context.getBean("std1");
        Student std2 = (Student) context.getBean("std2");
        Student std3 = (Student) context.getBean("std3");
        Student std4 = (Student) context.getBean("std4");
        Student std5 = (Student) context.getBean("std5");


        //  Print student details using toString method

        System.out.println();
        System.out.println("---SpringCore Application Started 1---");
        System.out.println(std1);

        System.out.println();
        System.out.println("---SpringCore Application Started 2---");
        System.out.println(std2);

        System.out.println();
        System.out.println("---SpringCore Application Started 3---");
        System.out.println(std3);

        System.out.println();
        System.out.println("---SpringCore Application Started 4---");
        System.out.println(std4);

        System.out.println();
        System.out.println("---SpringCore Application Started 5---");
        System.out.println(std5);
    }
}


