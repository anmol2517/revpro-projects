import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String num = sc.next(); // input as string

        int evenSum = 0;
        int oddSum = 0;
        boolean firstEven = true;
        boolean firstOdd = true;

        System.out.print("Even Number : ");
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 == 0) { // even
                evenSum += digit;
                if (!firstEven) {
                    System.out.print(" + ");
                }
                System.out.print(digit);
                firstEven = false;
            }
        }
        System.out.println(" = " + evenSum);

        System.out.print("Odd Number : ");
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 != 0) { // odd
                oddSum += digit;
                if (!firstOdd) {
                    System.out.print(" + ");
                }
                System.out.print(digit);
                firstOdd = false;
            }
        }
        System.out.println(" = " + oddSum);
    }
}
