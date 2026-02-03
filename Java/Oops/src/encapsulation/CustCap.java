package encapsulation;

// Class 1: CustCap (Customer)

public class CustCap {
    private String name;
    private String email;

    public CustCap(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public void setName(String name) { if(name != null && !name.isEmpty()) this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { if(email != null && email.contains("@")) this.email = email; }

    public void displayCustInfo() {
        System.out.println("Customer Name: " + name + ", Email: " + email);
    }
}

// Class 2: Product
class ProductCap {
    private String productName;
    private double price;

    public ProductCap(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { if(productName != null) this.productName = productName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { if(price > 0) this.price = price; }

    public void displayProductInfo() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }
}

// Class 3: Order
class Order {
    private CustCap customer;
    private Product product;
    private int quantity;

    public Order(CustCap customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public CustCap getCustomer() { return customer; }
    public void setCustomer(CustCap customer) { this.customer = customer; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { if(quantity > 0) this.quantity = quantity; }

    public void displayOrderInfo() {
        System.out.println("Order Details:");
        customer.displayCustInfo();
        product.displayProductInfo();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + (product.getPrice() * quantity));
    }
}
