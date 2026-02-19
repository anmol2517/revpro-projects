package demos.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demos.springboot.model.Address;
import demos.springboot.model.Employee;
import demos.springboot.repository.AddressRepository;
import demos.springboot.repository.EmployeeRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository repository;
	
	public Address add(Address address) {
		return repository.save(address);
	}
	
	public Address getById(int id) {
		return repository.getReferenceById(id);
	}
	
	public List<Address> getAll() {
		return repository.findAll();
	}

	public void delete(int id) {
		repository.deleteById(id);
	}



}
