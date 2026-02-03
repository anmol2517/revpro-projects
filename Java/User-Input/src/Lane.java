import java.util.Scanner;

public class Lane {
    public static void main(String[] args){
        String address;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address : ");

        address = input.nextLine();
        System.out.println("Your address is : " + address);

        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");

        name = sc.next();
        System.out.println("hey! " + name + " Welcome Back...");

        Scanner sc2 = new Scanner(System.in);
        System.out.println("fh is full house - ");
        String fh = sc2.nextLine();
        System.out.println("fh is : " + (fh));

        Scanner sc3 = new Scanner(System.in);
        System.out.println("h is house full- ");
        String h = sc2.next();
        System.out.println("h is : " + (h));

    }
}
