
package demos.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demos.springboot.entity.Product;
import demos.springboot.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController

@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService service;

	@PostMapping("/add")
	public void addProduct(@RequestBody Product product) {
		service.add(product);
	}
	
	
	@GetMapping("/getAll")
	public List<Product> getAllProducts() {
		return service.getAll();
		
	}
	
	@GetMapping("/{prodId}")
	public Product getById(@PathVariable("prodId") int id) {
		return service.getById(id);
	}
	
	
	@PutMapping("/{prodId}")
	public Product update(@PathVariable("prodId")int id, @RequestBody Product prod) {
		prod.setProdId(id);
		return service.update(prod);
		
	}
	
	
	@DeleteMapping("/{prodId}")
	public void delete(@PathVariable("prodId")int id) {
		
		service.delete(id);
		
	}
	
	@GetMapping("/brand/{brandName}")
	List<Product> findAllByBrand(@PathVariable("brandName") String brand) {
		return service.findAllByBrand(brand);
	}
	
	@GetMapping("/name/{prodName}")
	public List<Product> findByName(@PathVariable("prodName")String name) {
		return service.findByName(name);
	}
	
	@GetMapping("/brand/{brand}/price/{price}")
	public List<Product> findAllByBrandAndPriceEquals(@PathVariable("brand") String brand,@PathVariable("price") double price) {
		return service.findAllByBrandAndPriceEquals(brand, price);
	}
	
	@GetMapping("/priceLessThan/{price}")
	public List<Product> findAllByPriceLessThan(@PathVariable("price")double price) {
		return service.findAllByPriceLessThan(price);
	}

	
	@GetMapping("/priceBetween/{price1}/{price2}")
	public List<Product> findAllByPriceBetween(@PathVariable("price1")double price1,@PathVariable("price2") double price2){
		return service.findAllByPriceBetween(price1, price2);
		
	}
	
	
	@GetMapping
	public List<Product> findAllByBrandAndPrice(@RequestParam(value = "brand", required = false)   String brand,@RequestParam(value="price", required = false) Double price) {
		
		if(brand != null && price!=null) {
			return service.findAllByBrandAndPriceEquals(brand, price);
		}
		else if(brand == null && price != null) {
			return service.findAllByPrice(price);
		}
		
		else if(brand!= null && price == null) {
			return service.getBrandProducts(brand);
		}
		else {
			return service.getAll();
		}
		
		
	}

}
