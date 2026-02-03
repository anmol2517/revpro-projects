//  2D Array

public class Error {
    public static void main (String[] args) {
        int a[][] = {
                {11, 12, 13, 14, 15, 16, 17},
                {23, 67, 78, 69, 97, 33}
        };

        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
                sum += a[i][j];  //  Sum Assigned already
            }


            sum = sum + a[i][a[i].length-1];

            System.out.println();

        }
        System.out.println("-------------");
        System.out.println("total sum is : " + sum);  //  this line only show total
    }
}