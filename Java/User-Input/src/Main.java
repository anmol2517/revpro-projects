import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x , y , z;

        Scanner sc = new Scanner(System.in);
        System.out.println("Value of x is : ");
        x = sc.nextInt();
        System.out.println("Value of y is : ");
        y = sc.nextInt();
        z = x + y;

        System.out.println("Sum of x + y is : " + (x + y));
        System.out.println("Now value of z is : " + z);
    }
}