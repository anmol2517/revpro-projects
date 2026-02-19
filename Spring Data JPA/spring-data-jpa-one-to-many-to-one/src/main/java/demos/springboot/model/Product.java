
package demos.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_prodid_seq")
	@SequenceGenerator(name = "product_prodid_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "prodid",scale = 10)
	private int prodId;
	
	@Column(name = "prodname", length = 40)
	private String prodName;
	
	@Column(name = "brand", length = 40)
	private String brand;
	
	@Column(name = "price",  precision = 2)
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "category")
	@JsonIgnoreProperties("products")
	private Category category;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String prodName, String brand, Double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.brand = brand;
		this.price = price;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", brand=" + brand + ", price=" + price + "]";
	}
}
