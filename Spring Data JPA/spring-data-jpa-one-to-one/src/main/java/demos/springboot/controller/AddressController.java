package demos.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import demos.springboot.model.Address;
import demos.springboot.model.Employee;
import demos.springboot.repository.AddressRepository;
import demos.springboot.repository.EmployeeRepository;
import demos.springboot.service.AddressService;

@RestController
@RequestMapping("/api")
public class AddressController {
	
	@Autowired
	private AddressService service;

	@PutMapping("/addresses/{id}")
	public Address update(@PathVariable int id, @RequestBody Address address) {
		address.setId(id);
		return service.add(address);
	}

	@DeleteMapping("/addresses/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "Address deleted";
	}
	
	@GetMapping("/addresses/{id}")
	public Address getById(int id) {
		return service.getById(id);
	}
	
	@GetMapping("/addresses")
	public List<Address> getAll() {
		return service.getAll();
	}

}
