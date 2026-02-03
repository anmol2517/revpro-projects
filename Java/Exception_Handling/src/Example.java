public class Example {
    public static void main(String[] args) {
        int a , b, c;

        a = 25;
        b = 0;

        try{
            c = a / b;
            System.out.println("Value of c is : " + c);
        }
        catch (ArithmeticException aexc) {

            System.out.println(aexc.getMessage());

            //  this line say that reasons for error
            //  ('aexc(object) / getMessage / toString')
            //  (" aexc.printStackTrace() ")

        }
        System.out.println("Program Continues!");
    }
}

