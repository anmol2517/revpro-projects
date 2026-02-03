public class Demo {
    static int count = 5; // static variables

    public static void main(String[] args) {

        System.out.println("Static Variables  : " + Demo.count);
        Demo.count++;
        System.out.println("Static Variables  : " + Demo.count);
        Demo.count--;
        System.out.println("Static Variables  : " + Demo.count);
    }
}
