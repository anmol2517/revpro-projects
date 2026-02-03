public class Sample {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("value of c is : " + c);
        }
        catch(Exception exc) {
            System.out.println("Not Possible!");
        }
    }
}

