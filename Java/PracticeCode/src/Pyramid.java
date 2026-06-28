public class Pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {     // for (int i = 1; i <= n; i++)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int m = 4;
        for (int a = 1; a <= m; a++) {  //  for (int i = n; i >= 1; i--)
            for (int s = 0; s < m - a; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
