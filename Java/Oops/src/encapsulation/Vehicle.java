package encapsulation;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private int speed;

    // Constructor
    public Vehicle(String vehicleNumber, String vehicleType, int speed) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.speed = speed;
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        if(vehicleNumber != null && !vehicleNumber.isEmpty()) {
            this.vehicleNumber = vehicleNumber;
        } else {
            System.out.println("Invalid vehicle number!");
        }
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        if(vehicleType != null && !vehicleType.isEmpty()) {
            this.vehicleType = vehicleType;
        } else {
            System.out.println("Invalid vehicle type!");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative!");
        }
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Speed: " + speed + " km/h");
    }
}
