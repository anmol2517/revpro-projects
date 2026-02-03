import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size, sum = 0;

        System.out.println("Enter the size of array : ");
        size = sc.nextInt();
        System.out.println("Your Entered Array : " + size);
        System.out.println("======================");


        int a[] = new int[size];
        System.out.println("Enter " + size + " elements : ");
        System.out.println("======================");

        for (int i = 0; i < size; i++) {
            (a[i]) = sc.nextInt();

            // System.out.println();  not write
            // when we write have a data but in this case we take a user input
        }

        System.out.println("Your Entered Array : " + a.length);

        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);

            sum = sum + a[i];
        }
        System.out.println();
        System.out.println("Sum is : " + sum);
    }
}
