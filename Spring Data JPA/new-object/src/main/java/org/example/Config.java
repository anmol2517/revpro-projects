package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Student student() {
        Student s = new Student();
        s.setName("James Bond");
        s.setAge(25);
        s.setRoll(21);
        return s;
    }

    @Bean
    public Cars car() {
        Cars c = new Cars();
        c.setCompany("TATA");
        c.setCar_name("Harrier");
        return c;
    }

    @Bean
    public UsingAttribute usingAttribute() {
        UsingAttribute ua = new UsingAttribute();
        ua.setStudent(student());
        ua.setCar(car());
        return ua;
    }
}

