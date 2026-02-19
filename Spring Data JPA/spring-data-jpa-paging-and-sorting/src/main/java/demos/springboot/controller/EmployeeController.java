//EmployeeController.java
package demos.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demos.springboot.model.Employee;
import demos.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
    private EmployeeService service;
 
	//http://localhost:9090/employees?pageNo=1&pageSize=5&sortBy=empName
	//http://localhost:9090/employees?pageSize=5&sortBy=empName
	//http://localhost:9090/employees?pageNo=1&sortBy=empName
	//http://localhost:9090/employees?pageNo=1&pageSize=5
	//http://localhost:9090/employees?pageNo=1
	//http://localhost:9090/employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(
                        @RequestParam(defaultValue="0", required = false) Integer pageNo,
                        @RequestParam(defaultValue = "10", required = false) Integer pageSize,
                        @RequestParam(defaultValue = "id", required = false) String sortBy) 
    {
        List<Employee> list = service.getAllEmployees(pageNo, pageSize, sortBy);
 
        return list;   
    }

}

//http://localhost:9090/employees/1


//http://localhost:9090/employees
