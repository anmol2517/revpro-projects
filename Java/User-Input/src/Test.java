import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = sc.nextDouble();
        double c = a * b;
        System.out.println("Value of c is : " + (a + b));
    }
}

