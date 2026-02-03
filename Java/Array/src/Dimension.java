// 2D Array

import java.util.Scanner;

public class Dimension {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size, sum = 0, rows, cols;

        System.out.print("Enter the No. Rows : ");

        rows = sc.nextInt();

        System.out.print("Enter the No. Columns : ");

        cols = sc.nextInt();

        int x[][] = new int[rows][cols];

        System.out.println("Combination is : " + rows * cols);

        System.out.println("====================");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                x[i][j] = sc.nextInt();
                sum += x[i][j];
            }
        }
        System.out.println("Given Values Below");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum is : " + sum);
    }
}
