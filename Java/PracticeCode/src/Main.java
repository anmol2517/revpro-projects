import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option :");
        System.out.println("1. Print Hello World");

        System.out.println("2. Find Area of Circle");
        System.out.println("3. Find Sum of Two Numbers");

        System.out.println("4. Find Square of a Number");
        System.out.println("5. Find Greatest of Two Numbers");
        System.out.println("----------------");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello World!");
                break;

            case 2:
                System.out.print("Enter radius 2 : ");
                float r = sc.nextFloat();
                float area = 3.14f * r * r;

                System.out.println("Area of circle = " + area);
                break;

            case 3:
                System.out.print("Enter first number : ");
                int a = sc.nextInt();

                System.out.print("Enter second number : ");
                int b = sc.nextInt();

                System.out.println("Sum = " + (a + b));
                break;

            case 4:
                System.out.print("Enter a number : ");
                int n = sc.nextInt();
                System.out.println("Square = " + (n * n));
                break;

            case 5:
                System.out.print("Enter first number : ");
                int x = sc.nextInt();
                System.out.print("Enter second number : ");
                int y = sc.nextInt();

                if (x > y)
                    System.out.println(x + " is greatest");

                else
                    System.out.println(y + " is greatest");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
