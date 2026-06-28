public class Fibonacci {
    public static void main(String[] args) {
        int n = 11;
        int a = 0;
        int b = 1;

        System.out.println("Fibbonacci: ");

        for (int i = 0; i <= n; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
