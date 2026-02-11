package org.example.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    @Qualifier("amdProcessor")
    private CPU cpu;

    public void start() {
        cpu.process();
        System.out.println("System diagnostic complete.");
    }
}

