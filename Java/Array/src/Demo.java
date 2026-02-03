// 2D Array

public class Demo {
    public static void main(String[] args) {
        int a[][] = {
                {12, 23, 51, 47, 97, 56},
                 {433, 233, 254, 535, 876, 884},
        };

        //  System.out.println(a[0][5]);

        /*

         [0] - this is rows
         [5] - columns

         r - rows & c - columns

         */

        for (int r = 0; r <= 1; r++) {        //  :   (int r = 0; r < a.length; r++)
            for (int c = 0; c <= 5; c++) {    //  :  (int c = 0; c < a[r].length; c++)

                System.out.print(a[r] [c] + " ");
            }
            System.out.println();
        }
    }
}


/*
             c0   c1   c2   c3   c4   c5
             r0 →   12   23   51   47   97   56
             r1 →  433  233  254  535  876  884
*/
