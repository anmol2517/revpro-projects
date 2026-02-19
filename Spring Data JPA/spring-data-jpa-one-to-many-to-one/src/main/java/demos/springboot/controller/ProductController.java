//ProductController.java
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demos.springboot.model.Category;
import demos.springboot.model.Product;
import demos.springboot.repository.ProductRepository;
import demos.springboot.service.ProductService;


@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	
	@GetMapping("/products/{id}")
	public Product getById(@PathVariable("id")int prodId) {
		return service.getById(prodId);
	}
	
	
	@GetMapping("/categories/{catId}/products")
	public List<Product> findAllByCategoryCategoryId(@PathVariable("catId")int catId){
		return service.findAllByCategoryCategoryId(catId);
	}
	

	
	@PostMapping("/categories/{catId}/products")
	public Product addProduct(@PathVariable("catId")int catId, @RequestBody Product p) {
		p.setCategory(new Category(catId, "",""));
		return service.addProduct(p);
	}
	
	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable("id") int prodId, @RequestBody Product p) {
		if(p == null) {
			throw new NullPointerException("Product object is null in class - ProdutService and method: updateProduct");
		}
		p.setProdId(prodId);
		return service.updateProduct(p);
	}
	
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable("id")int prodId) {
		service.deleteProduct(prodId);
	}

}
