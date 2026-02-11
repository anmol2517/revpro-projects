package org.example.autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Intel implements CPU {
    @Override
    public void process() {
        System.out.println("Using Intel i9 - High Performance Mode");
    }
}

