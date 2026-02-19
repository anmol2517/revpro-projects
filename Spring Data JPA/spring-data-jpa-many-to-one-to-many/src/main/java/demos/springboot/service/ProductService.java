package demos.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import demos.springboot.model.Product;
import demos.springboot.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product add(Product product) {
		return repository.save(product);
	}
	
	public List<Product> getAll() {
		return repository.findAll();
	}
	
	public List<Product> getAllByCategory(int catId) {
		return repository.findAllByCategoryCatId(catId);
	}
	
	public Product getById(int id) {
		return repository.getReferenceById(id);
	}
	
	public Product update(Product product) {
		return repository.save(product);
	}
	
	public void delete(int prodId) {
		repository.deleteById(prodId);
	}

}
