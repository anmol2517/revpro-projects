package org.springboots.bootsthrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("getData")
    public List<Employee> hello() {
        Employee emp1 = new Employee();

        // emp1.setEmpId(1);

        emp1.setEmpName("Ravi Shastri");
        emp1.setEmpDept("IT");
        emp1.setEmpWorkLocation("Pune");
        emp1.setEmpRole("Senior Technical Analsyst");
        emp1.setEmpSalary(86000);
        repository.save(emp1);

        Employee emp2 = new Employee();

        // emp2.setEmpId(1);

        emp2.setEmpName("Sachin Shastri");
        emp2.setEmpDept("Cloud");
        emp2.setEmpWorkLocation("Mumbai");
        emp2.setEmpRole("Senior Cloud Engineer (Azure)");
        emp2.setEmpSalary(96000);
        repository.save(emp2);

        return repository.findAll();
        // return emp1.toString() + " | " + emp2.toString();
    }

}
