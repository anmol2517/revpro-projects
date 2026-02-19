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
import demos.springboot.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	@PostMapping("/categories/{catId}/products")
	public Product add(@PathVariable("catId")int catId, @RequestBody Product product) {
		Category category = new Category();
		category.setCatId(catId);
		product.setCategory(category);
		return service.add(product);
	}
	
	@GetMapping("/products")
	public List<Product> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/categories/{catId}/products")
	public List<Product> getAllByCategory(@PathVariable("catId")int catId) {
		return service.getAllByCategory(catId);
	}
	
	
	@GetMapping("/products/{id}")
	public Product getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@PutMapping("/products/{id}")
	public Product update(@PathVariable int prodId,@RequestBody Product product) {
		return service.update(product);
	}
	
	
	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable("id") int prodId) {
		service.delete(prodId);
	}

}
