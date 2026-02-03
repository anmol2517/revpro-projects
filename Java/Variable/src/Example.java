public class Example {

    int x = 17; // instance variable

    String college = "IIE";  // instance variable

    static int count = 7; // static variables

    public static void main(String[] args){

        int localVar = 67;
        System.out.println("Local Variavle value is : " + localVar);

        Example e = new Example();

        System.out.println(e.x);
        Example.count++;

        System.out.println(e.college);

        System.out.println(e.count);
        count--;
        System.out.println(e.count);
        count++;
        System.out.println(e.count);
    }
}
