public class Test {
    public static void main(String[] args){
        int a = 7;
        int b = 9;

        int result = a++ + ++b + b++ + ++a;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("result : " + result);

        System.out.println("-----------------");

        int x = 22;
        int y = 33;
        int z;

        z = x++ + y++ + ++x + ++y;
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("z : " + z);
    }
}
