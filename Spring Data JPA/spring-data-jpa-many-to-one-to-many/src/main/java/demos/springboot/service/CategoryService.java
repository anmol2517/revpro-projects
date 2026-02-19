package demos.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demos.springboot.model.Category;
import demos.springboot.model.Product;
import demos.springboot.repository.CategoryRepository;
import demos.springboot.repository.ProductRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category add(Category category) {
		return repository.save(category);
	}
	
	public List<Category> getAll() {
		return repository.findAll();
	}
	
	public Category getById(int id) {
		return repository.getReferenceById(id);
	}
	
	public Category update(Category category) {
		return repository.save(category);
	}
	
	public void delete(int catId) {
		repository.deleteById(catId);
	}

}
