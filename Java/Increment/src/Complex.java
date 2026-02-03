public class Complex {
    public static void main(String[] args){
        int a = 44;
        int b = 55;
        int c;
        int d;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("-------------");

        c = a++ + b++ - --a + --b;
        System.out.println(c);


        d = --a - b++ + ++a - b--;
        System.out.println(d);

        System.out.println("-------------");

        int x = 66;    // ASCII Value
        char ch = (char) x;
        System.out.println("Char value is : " + ch);
    }
}
