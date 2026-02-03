import java.util.Scanner;

public class Sample {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of user1 : ");
        int user1 = sc.nextInt();
        System.out.println("Enter the value of user2 : ");
        int user2 = sc.nextInt();

        System.out.println("--------SELECT CHOICE--------");
        System.out.println("Enter your choice : \n1 Add \n2 Subtract \n3 Multiply \n4 Division");

        int choice = sc.nextInt();
        System.out.println("Your Choice is : " + choice);

        if(choice == 1){
            System.out.println("Sum of user1 and user2 is : " + (user1 + user2));
        } else if (choice == 2){
            System.out.println("Subtract of user1 and user2 is : " + (user1 - user2));
        } else if (choice == 3){
            System.out.println("Multiply of user1 and user2 is : " + (user1 * user2));
        } else if (choice == 4){
            System.out.println("Division of user1 and user2 is : " + (user1 / user2));
        } else {
            System.out.println("Invalid choice");
        }
    }
}

