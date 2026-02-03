import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n % 5 == 0){
            System.out.println("Number is divisible");
        } else {
            System.out.println("Number if not divisible");
        }
    }
}
