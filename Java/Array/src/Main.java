public class Main{
    public static void main(String[] args){

        int sum = 0;
        int x[] = {10, 20, 54};

        System.out.println(x[2]);
        System.out.println("------");

        int y[] = {10, 20, 51, 670, 35, 80, 376};

        for (int z:y) {
            System.out.print(z + " ");
            sum = sum + z;

            // System.out.println("sum is : " + sum);
        }
        System.out.println();
        System.out.println("total sum is : " + sum);
    }
}
