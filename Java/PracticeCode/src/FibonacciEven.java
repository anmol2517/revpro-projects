public class FibonacciEven {
    public static void main(String[] args) {
     int n = 16;
     int a = 0;
     int b = 1;
        System.out.println("Fibonacci: ");

        for(int i = 0; i <= n; i++){
            if(a % 2 != 0) System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
