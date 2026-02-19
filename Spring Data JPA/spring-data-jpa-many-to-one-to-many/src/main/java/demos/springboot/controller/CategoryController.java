package demos.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demos.springboot.model.Category;
import demos.springboot.model.Product;
import demos.springboot.service.CategoryService;
import demos.springboot.service.ProductService;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	private CategoryService service;


	@PostMapping("/categories")
	public Category add(@RequestBody Category category) {
		return service.add(category);
	}
	
	@GetMapping("/categories")
	public List<Category> getAll() {
		return service.getAll();
	}
	
	
	@GetMapping("/categories/{id}")
	public Category getById(@PathVariable int id) {
		return service.getById(id);
	}

	@PutMapping("/categories/{id}")
	public Category update(@PathVariable("id") int id, @RequestBody Category category) {
		return service.update(category);
	}
	@DeleteMapping("/categories/{id}")
	public void delete(@PathVariable("id") int catId) {
		service.delete(catId);
	}

}

