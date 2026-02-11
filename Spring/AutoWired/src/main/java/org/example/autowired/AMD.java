package org.example.autowired;

import org.springframework.stereotype.Component;

@Component("amdProcessor")
public class AMD implements CPU {
    @Override
    public void process() {
        System.out.println("Using AMD Ryzen - Multitasking Mode");
    }
}

