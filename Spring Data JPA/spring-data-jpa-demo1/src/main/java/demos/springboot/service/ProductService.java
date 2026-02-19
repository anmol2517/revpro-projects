package demos.springboot.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import demos.springboot.entity.Product;
import demos.springboot.exceptions.ResourceNotFoundException;
import demos.springboot.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product add(Product p) {
		if(p == null) {
			throw new NullPointerException("Cannot perform save operation.Product object is null");
		}
		return repository.save(p);
	}
	
	public Product getById(int id) {
		

		Product product = repository.getReferenceById(id);
		return product;
	}
	
	public List<Product> getAll() {
		

		List<Product> products = repository.findAll();
		return products;
	}
	
	public Product update(Product product) {
		if(product == null) {
			throw new NullPointerException("Cannot perform update operation.Product object is null");
		}
		return repository.save(product);
	}
	
	public void delete(int prodId) {
		repository.deleteById(prodId);
	}
	
	
	
	public List<Product> findAllByBrand(String brand) {
		return repository.findAllByBrand(brand);
	}
	
	public List<Product> findByName(String name) {
		return repository.findByProdName(name);
	}
	
	public List<Product> findAllByBrandAndPriceEquals(String brand, double price) {
		return repository.findAllByBrandAndPriceEquals(brand, price);
	}
	
	
	public List<Product> findAllByPriceLessThan(double price) {
		return repository.findAllByPriceLessThan(price);
	}

	public List<Product> findAllByPriceBetween(double price1, double price2){
		return repository.findAllByPriceBetween(price1, price2);
		
	}
	
	public List<Product> findAllByPrice(double price) {
		return repository.findAllByPrice(price);
	}
	
	
	public List<Product> getBrandProducts(String brand) {
		return repository.getBrandProducts(brand);
	}


}
