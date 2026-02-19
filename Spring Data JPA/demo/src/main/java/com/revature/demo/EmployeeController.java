package com.revature.demo;

import com.revature.demo.revfirst.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/emp")
    public Employee getEmployee() {
        return new Employee("101", "Ganpat Rao", 50000);
    }
}



/*

*/