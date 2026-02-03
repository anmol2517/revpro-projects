import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.println("Welcome Aaye Swagat Hai Aapka Revature Book Store Me");
        System.out.println("Choose kar bhai konse type ka books lena chata hai or jaldi select kar - soch mat? 'Yes' or 'No'");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);

        if (choice == 'Y') {
            System.out.println("1.\t Story Books");
            System.out.println("2.\t Educational Books");
            System.out.println("3.\t Comics");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Story Books");
                    System.out.println("1.\t Panchatantra se hasil kare wo sab jo chate hai aap");
                    System.out.println("2.\t Seven Thoughts Aur Bano Crorepati");
                    break;
                case 2:
                    System.out.println("Educational Books");
                    System.out.println("1.\t Java Full Stack");
                    System.out.println("2.\t Angular Frontend");
                    break;
                case 3:
                    System.out.println("Comics");
                    System.out.println("1.\t Chacha Chaudhary");
                    System.out.println("2.\t Motu Patlu");
                    break;
                default:
                    System.out.println("Abe kya kar rha hai shi se dekhle pehle option");
            }
        } else {
            System.out.println("nikal jaldi yaha se bhaag jaldi.. time waste karne aajate hai kha kha se...");
            System.exit(0);
        }
    }
}
