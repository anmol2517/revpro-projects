import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;

        System.out.println("-----Select correct vowels-----");
        System.out.println("Enter your choice : (a , e , i , o , u)");

        ch = sc.next().charAt(0);
        System.out.println("Your selected choice is : " + ch);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch +  " : it is vowels - your selected choice is correct");
                break;

            default:
                System.out.println(ch + " is not a valid choice");
        }
    }
}
