import java.util.Scanner;

public class Revo {
    public static void main(String[] args){
        int marks;
        System.out.println("Enter your marks : ");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();

        if(marks >= 80){
            System.out.println("You Got Grade A");
        } else if(marks >= 65){
            System.out.println("You Got Grade B");
        } else if(marks >= 40) {
            System.out.println("You Got Grade C");
        } else {
            System.out.println("Fails");
        }
    }
}
