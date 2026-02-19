package demos.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_prodid_seq")
	@SequenceGenerator(name="prod_prodid_seq")
	@Column(name="prodid")
	private int prodId;
	
	@Column(name = "prodname")
	private String prodName;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="price")
	private double price;
	
	@Column(name = "category")
	private String category;
	
	

	public Product() {
		super();
	}

	public Product(int prodId, String prodName, String brand, double price) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", brand=" + brand + ", price=" + price + "]";
	}
}
