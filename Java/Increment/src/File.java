public class File {
    public static void main(String[] args){

        // Implicit Casting

        int a = 22;
        double b = a;

        System.out.println("Implicit Casting");
        System.out.println(a);
        System.out.println(b);
        System.out.println("------------");

        double x = 25.87;
        int y = (int) x;

        System.out.println("Explicit Casting");
        System.out.println(x);
        System.out.println(y);
        System.out.println("------------");

        // The casting happens.....!!

        int p = 66;
        double q = p + 2.22;

        System.out.println("Example ");
        System.out.println(p);
        System.out.println(q);
    }
}
