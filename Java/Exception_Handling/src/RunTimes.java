import java.lang.reflect.Array;

public class RunTimes {
    public static void main(String[] args) {

        int x[] = {1, 2, 3, 4};

        System.out.println(x.length);

//        System.out.println(x[5]);   //  Runtime Error Terminate Program

        System.out.println("=================");


        int y[] = {1, 2, 3, 4, 5};

        System.out.println(y.length);  // 5

        System.out.println(y[2]);   // 3

        try {
            System.out.println(y[5]);  // none
        }

        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Not Possible!");
        }
        System.out.println("Program Continues");
    }
}

