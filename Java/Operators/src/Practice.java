import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        int age;
        System.out.println("I want to apply driving license - Lets check eligbility criteria!!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();


        System.out.println("-------------------");

        if(age >= 18){
            System.out.println("I am ok apply - no worries");
        } else {
            System.out.println("Not Eligble");
        }

        System.out.println("-------------");
        System.out.println("--------------");

        int day;
        System.out.println("Enter day number (1-7): ");
        day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working Day");
                break;
            case 6:
            case 7:
                System.out.println("Not Working!! Enjoy");
                break;
            default:
                System.out.println("Invalid Day");
        }

    }
}
