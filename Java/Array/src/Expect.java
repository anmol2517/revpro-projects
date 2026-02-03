public class Expect {
    public static void main(String[] args) {

        int sum = 0;
        int x[][] = {
                {1, 2, 3, 4, 5}, {11, 22, 33,44, 55}
        };

        // r - rows  ||  c - cols

        for (int r = 0; r < x.length; r++) {
            for (int c = 0; c < x[r].length; c++) {
                System.out.print(x[r][c] + " ");
                sum = sum + x[r][c];
            }
            System.out.println();

        }
        System.out.println("total sum is : " + sum);
    }
}
