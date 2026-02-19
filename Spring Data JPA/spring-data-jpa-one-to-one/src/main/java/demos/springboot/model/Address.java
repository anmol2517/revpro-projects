
package demos.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@Column(name = "addressid")
	

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_addid_seq")
	@SequenceGenerator(name = "address_addid_seq", initialValue = 1, allocationSize = 1)
	private int id;
	
	@Column(name = "street", length=20)
	private String street;
	
	@Column(name = "city", length = 20)
	private String city;
	
	@Column(name = "pincode", length = 6)
	private String pincode;

	@OneToOne
    @JoinTable(name = "employee_address", 
      joinColumns = 
        { @JoinColumn(name = "address_id", referencedColumnName = "addressid") },
      inverseJoinColumns = 
        { @JoinColumn(name = "employee_id", referencedColumnName = "empid") })
	private Employee employee;

	public Address() {
		super();

	}

	public Address(int id, String street, String city, String pincode) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
