public class Main {
    public static void main(String[] args) {

        int x = 10;
        System.out.println("Value of x is : " + x);

        float f = 11.34f;
        System.out.println("Value of f is : " + f);

        double de = 21.22; //  Conversion
        System.out.println("Value of d is : " + de);

        int s = 55;
        System.out.println("Value of s is : " + s);

        //  TypeCasting

        double y = x;
        System.out.println("After Convert in Double value of x is : " + y);

        double z = f;
        System.out.println("After Convert in Double value of f is : " + z);

        int a = (int)de;
        System.out.println("After Convert in Double value of de is : " + a);


        // String s = b;
        // Compile Type Error Not Convert in String to Integer

        /* Possible but some other compiler
        String s = String.valueOf(b);
        System.out.println("After Convert in String value of is : b " + s);
        */

        // Explict (large to short | Implict compiler not done)
    }
}
