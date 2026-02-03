//  3D Array

public class Array {
    public static void main(String[] args) {
        int[][][] a = {
                {
                        {234, 432, 255, 345, 345},
                        {2345, 2360, 5678, 9876}
                },
                {
                        {45, 13243, 34534},
                        {56, 323, 2345, 543, 2345}
                }
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println(a[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
