public class Swap {
    public static void main(String[] args) {
        int a = 6, b = 11;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
