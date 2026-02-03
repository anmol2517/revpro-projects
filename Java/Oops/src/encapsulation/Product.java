package encapsulation;

public class Product {
    private String productName;
    private String productCode;
    private double price;
    private int quantity;

    // Constructor
    public Product(String productName, String productCode, double price, int quantity) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if(productName != null && !productName.isEmpty()) {
            this.productName = productName;
        } else {
            System.out.println("Invalid product name!");
        }
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        if(productCode != null && !productCode.isEmpty()) {
            this.productCode = productCode;
        } else {
            System.out.println("Invalid product code!");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive.");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    // Display product details
    public void displayProductInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Code: " + productCode);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
