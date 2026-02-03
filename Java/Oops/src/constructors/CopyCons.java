package constructors;

public class CopyCons {
    private String country;
    private String city;

    private int pincode;
    public String address;

    public CopyCons(String country, String city, int pincode,String address ) {
        this.country = country;;
        this.city = city;

        this.pincode = pincode;
        this.address = address;
    }

    public void display(){
        System.out.println("Country : " + country);
        System.out.println("City : " + city);

        System.out.println("Pincode : " + pincode);
        System.out.println("Address : " + address);
    }


    CopyCons(CopyCons copycons1) {
        this.country = copycons1.country;
        this.city = copycons1.city;

        this.pincode = copycons1.pincode;
        this.address = copycons1.address;
    }


    public static void main(String[] args) {

        CopyCons copycons2 = new CopyCons("India", "Pune", 411038, "Ideal Colony");

        CopyCons copycons3 = new CopyCons(copycons2);

        System.out.println(copycons3.country);
        System.out.println(copycons3.city);
        System.out.println(copycons3.pincode);
        System.out.println(copycons3.address);


        copycons3.display();
    }
}
