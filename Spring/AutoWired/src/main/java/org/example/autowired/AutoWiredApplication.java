package org.example.autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutoWiredApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AutoWiredApplication.class, args);
        Computer comp = context.getBean(Computer.class);
        comp.start();
    }
}

