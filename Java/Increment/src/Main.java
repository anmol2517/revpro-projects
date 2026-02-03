public class Main {
    public static void main(String[] args) {


        int x = 6;
        int y = ++x;
        System.out.println("Pre Increment");
        System.out.println("Value of x is : " + x);
        System.out.println("Value of y is : " + y);

        System.out.println("-----------------");

        int a = 13;
        int b = a++;
        System.out.println("Post-Increment");
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);

    }
}