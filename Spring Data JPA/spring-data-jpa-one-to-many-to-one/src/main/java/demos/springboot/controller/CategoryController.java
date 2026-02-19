package demos.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
import demos.springboot.repository.ProductRepository;
import demos.springboot.service.CategoryService;
import demos.springboot.service.ProductService;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		return service.getAllCategories();
	}
	
	@GetMapping("/categories/{id}")
	public Category getById(@PathVariable("id")int catId) {
		return service.getById(catId);
	}
	
	@PostMapping("/categories")
	public Category addCategory(@RequestBody Category c) {
		return service.addCategory(c);
	}
	
	@PutMapping("/categories/{id}")
	public Category updateCategory(@PathVariable("id") int catId, @RequestBody Category c) {
		
		c.setCategoryId(catId);
		return service.updateCategory(c);
	}
	
	
	@DeleteMapping("/categories/{id}")
	public void deleteCategory(@PathVariable("id")int catId) {
		service.deleteCategory(catId);
	}

}
