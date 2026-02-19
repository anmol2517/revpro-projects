
package demos.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import demos.springboot.entity.Product;

@Repository

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findAllByBrand(String brand);
	List<Product> findByProdName(String name);
	List<Product> findAllByPrice(double price);
	
	List<Product> findAllByBrandAndPriceEquals(String brand, double price);
	
	public List<Product> findAllByPriceLessThan(double price);

	public List<Product> findAllByPriceBetween(double price1, double price2);
	
	@Query(value = "select * from product where brand=:brand", nativeQuery = true)
	public List<Product> getBrandProducts(@Param("brand")String brand);

}
