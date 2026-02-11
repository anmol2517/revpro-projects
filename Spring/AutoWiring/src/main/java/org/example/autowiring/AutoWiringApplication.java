package org.example.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Library library = context.getBean("library1", Library.class);
        System.out.println(library);
        System.out.println();
        System.out.println("=========================================");
        System.out.println();
        Student std = context.getBean("student1", Student.class);
        System.out.println(std);
        System.out.println(context.getBean("library1", Library.class));
        System.out.println();
        System.out.println("=========================================");
        System.out.println();
        Seller seller = context.getBean("seller1", Seller.class);
        Buyer buyer = context.getBean("buyer1", Buyer.class);
        System.out.println(seller);
        System.out.println(buyer);
    }
}


