// 2D Array

public class Sample {
    public static void main(String[] args) {

        int x[] = {53, 25, 37, 378, 9827, 245, 93782, 267};
        int []y = {53, 245, 93782, 267};
        int[] z = {53, 25, 37, 378, 9827, 267};

        System.out.println("Length of integer x is : " + x.length);
        System.out.println("Length of integer y is : " + y.length);
        System.out.println("Length of integer z is : " + z.length);

        System.out.println("----------------");

        int[] a = new int[5];
        System.out.println(a);
        System.out.println(a[1]);
        System.out.println(a[2]);

        // System.out.println(a[6]); -> runtime error
    }
}
