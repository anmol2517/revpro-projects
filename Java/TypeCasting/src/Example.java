public class Example {
    public static void main(String[] args){
        int x = 10;
        System.out.println("Value of x is : " + x);

        float f = x;
        System.out.println("After conversion value of x is : " + f);

        double d = 22.25;
        System.out.println("Value of d is : " + d);

        float f2 = 22.25f;
        System.out.println("Value of f2 is : " + f2);

        // Double is bigger and Float is Smaller
        // then we are using if we want to use or convert
        // double to float use this : "float f3 = (float)d;"

        float f3 = (float)d;

        System.out.println("After conversion value of d is : " + f3);

        double d2 = f2;
        System.out.println("After conversion value of d2 is : " + d2);

    }
}
