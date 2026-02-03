import java.util.Scanner;

public class UserChange {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");

        int first = sc.nextInt();

        System.out.print("enter a second number: ");
        int second = sc.nextInt();

        try{
           int result =  first / second;
            System.out.println("The result is : " + result);
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
            System.out.println("eroor : not possible or not divided by zero");
        }
        System.out.println("Proogram Terminated and Continued!");
    }
}
