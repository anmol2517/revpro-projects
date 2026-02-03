//  Parameters Declares in Methods

public class Demo {

    public int multiply(int x, int y) {
        int z = x * y;
        return z;
    }

    public int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Demo de = new Demo();

        int display = de.multiply(5,5);   //  Method Calling
        System.out.println("Value of z is : " + display);

        //  Arguments Value Passing

        System.out.println("Value of c is : " + de.sum(6,5));
    }
}


