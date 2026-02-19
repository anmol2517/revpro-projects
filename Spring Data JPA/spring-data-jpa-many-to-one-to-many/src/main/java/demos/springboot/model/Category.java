package demos.springboot.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;

@Entity
@Table(name = "category")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category {

	@Id
	@Column(name="catid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_catid_seq")
	@SequenceGenerator(name = "cat_catid_seq", initialValue = 1, allocationSize = 1)
	private int catId;

	@Column(name = "catname", length = 20)
	private String catName;

	@Column(name = "description", length = 20)
	private String description;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("category")
	private List<Product> products;

	public Category() {}

	public Category(int catId, String catName, String description) {
		this.catId = catId;
		this.catName = catName;
		this.description = description;
	}

	public int getCatId() { return catId; }
	public void setCatId(int catId) { this.catId = catId; }
	public String getCatName() { return catName; }
	public void setCatName(String catName) { this.catName = catName; }
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	public List<Product> getProducts() { return products; }
	public void setProducts(List<Product> products) { this.products = products; }

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + ", description=" + description + "]";
	}
}