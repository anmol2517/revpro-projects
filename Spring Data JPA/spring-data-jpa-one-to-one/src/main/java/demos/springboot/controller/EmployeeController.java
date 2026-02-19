package demos.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import demos.springboot.model.Employee;
import demos.springboot.repository.EmployeeRepository;
import demos.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/employees")
	public Employee add(@RequestBody Employee employee) {
		return service.add(employee);
	}

	@PutMapping("/employees/{id}")
	public Employee update(@PathVariable int id, @RequestBody Employee employee) {
		employee.setId(id);
		return service.add(employee);
	}

	@DeleteMapping("/employees/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "Employee deleted with id: " + id;
	}

	@GetMapping("/employees/{id}")
	public Employee getById(@PathVariable int id) {
		return service.getById(id);
	}

	@GetMapping("/employees")
	public List<Employee> getAll() {
		return service.getAll();
	}
}