// 2D Array

public class Test {
    public static void main(String[] args) {
        int a[][] = {
                {12, 23, 51, 47, 97, 56},
                {433, 233, 254, 535, 876, 884},
                {9, 8, 7, 6, 5, 4}
                };

        int sum = 0;

        for (int r = 0; r < a.length; r++)

        {
            for(int c = 0; c < a[r].length; c++)

            {
                System.out.print(a[r][c] + " ");
                sum = sum + a[r][c];

            }
            System.out.println("\n");
        }
        System.out.println("-------------");
        System.out.println("total sum is : " + sum);

    }
}
