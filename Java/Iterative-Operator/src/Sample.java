import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c = 0;

        System.out.println("Enter a number : ");
        a = sc.nextInt();

        while(a != 0) {
            b = a % 10; // part 1
            c = c + b; // part 2
            a = a/10; // part 3
        }
        System.out.println("The digit of the c is : " + c);
    }
}


/*
 a value is not zero then follow part 1,2,3 step by step
 then suppose we choose value of a is : 625

 a = 625
 b = 625 / 10 -- remainder : 5
 c = 0 + 5 = 5
 a = 625 / 10 = 62

 a value is : 62

 then we repeat the condition because its satisfied
 then repeat process:

 a = 62
 b = 62 / 10 -- remainder : 2
 c = 5 + 2 = 7
 a = 62 / 10 = 6

 a value is : 6

 then we repeat the condition because its satisfied
 then repeat process:

 a = 6
 b = 6 / 10 -- remainder : 6
 c = 7 + 6 = 13
 a = 6 / 10 = 0

 a value is : 0 -- now the loop is terminate

 Digit value of c is : 13

*/

