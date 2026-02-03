public class Pattern_Left {
    public static void main(String[] args) {

        for (int a = 1; a <= 5; a++) {                //  *
            for (int b = 1; b <= a; b++) {           //   * *
                System.out.print("* ");              //   * * *
            }                                       //    * * * *
            System.out.println();                  //     * * * * *
        }

        System.out.println("-------------");

        for (int x = 5; x >= 1; x--) {             //   * * * * *
            for (int y = 1; y <= x; y++) {         //   * * * *
                System.out.print("* ");            //   * * *
            }                                      //   * *
            System.out.println();                  //   *
        }

        System.out.println("-------------");

        for (int m = 1; m <= 5; m++) {             //   1
            for (int n = 1; n <= m; n++) {         //   1 2
                System.out.print(n + " ");         //   1 2 3
            }                                      //   1 2 3 4
            System.out.println();                  //   1 2 3 4 5
        }

        System.out.println("-------------");

        for (int p = 5; p >= 1; p--) {             //   5 4 3 2 1
            for (int q = p; q >= 1; q--) {         //   5 4 3 2
                System.out.print(q + " ");         //   5 4 3
            }                                      //   5 4
            System.out.println();                  //   5
        }

        System.out.println("-------------");

        for (int c = 1; c <= 5; c++) {             //   1
            for (int d = 1; d <= c; d++) {         //   2 2
                System.out.print(c + " ");         //   3 3 3
            }                                      //   4 4 4 4
            System.out.println();                  //   5 5 5 5 5
        }

        System.out.println("-------------");

        for (int u = 5; u >= 1; u--) {             //   5 5 5 5 5
            for (int v = 1; v <= u; v++) {         //   4 4 4 4
                System.out.print(u + " ");         //   3 3 3
            }                                      //   2 2
            System.out.println();                  //   1
        }
    }
}
