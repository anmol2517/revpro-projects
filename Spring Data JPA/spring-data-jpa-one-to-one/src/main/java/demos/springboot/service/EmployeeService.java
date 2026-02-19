
package demos.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demos.springboot.model.Employee;
import demos.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public Employee add(Employee employee) {
		return repository.save(employee);
	}
	
	public Employee getById(int id) {
		return repository.getReferenceById(id);
	}
	
	public List<Employee> getAll() {
		return repository.findAll();
	}

	public void delete(int id) {
		repository.deleteById(id);
	}

}
