//  Compile Time Error   :    Checked Exception
//  Run Time Error       :    Unchecked Exception


public class Runtime {
    public static void main(String[] args) {

        //  Runtime Error ('Unchecked Exception')

        int a = 10;
        int b = 0;

        int c = a / b;    // ArithmeticException
        System.out.println(c);
    }
}
