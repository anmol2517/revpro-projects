public class Space {
    public static void main(String[] args){
        int x = 11;
        int y = 22;
        int z;
        int z1;

        z = x-- + y-- + --x + --y;
        z1 = x-- - y-- - --x - --y;  // the value of change x and y therefore output is differ

        System.out.println("Value of x is : " + x);
        System.out.println("Value of z is : " + y);
        System.out.println("Value of z is : " + z);
        System.out.println("Value of z1 is : " + z1);
    }
}
