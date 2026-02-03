import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("User1 value is : ");
        int u1 = sc.nextInt();
        System.out.println("User2 value is : ");
        int u2 = sc.nextInt();

        System.out.println("-----Select choice-----");
        System.out.println("Enter your choice : \n1 Add \n2 Subtract \n3 Multiply \n4 Divide");
        int choice = sc.nextInt();
        System.out.println("Your selected choice is : " + choice);

        switch(choice){
            case 1:
                System.out.println("Sum of u1 and u2 is : " + (u1 + u2));
                break;
            case 2:
                System.out.println("Subtract of u1 and u2 is : " + (u1 - u2));
                break;

            case 3:
                System.out.println("Multiply of u1 and u2 is : " + (u1 * u2));
                break;

            case 4:
                System.out.println("Division of u1 and u2 is : " + (u1 / u2));
                break;

            case 5:
                System.out.println("Invalid Choice...");
                break;
        }
    }
}