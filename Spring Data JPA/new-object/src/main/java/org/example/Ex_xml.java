package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex_xml {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Student stu = context.getBean(Student.class);
        Cars car = context.getBean(Cars.class);
        UsingAttribute ua = context.getBean(UsingAttribute.class);

        System.out.println(stu);
        System.out.println(car);
        System.out.println(ua);

        context.close();
    }
}
