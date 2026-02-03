public class Execute {
    public static void main(String[] args){
        int x = 77;
        int y = ++x;
        int z = y++;
        int m;

        m = x++ - ++x + ++y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("-------------");
        System.out.println(m);
        System.out.println("-------------");

        int a = 45;
        int b = a++;
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("-------------");

        int q = 77;
        int p = --q;
        int w = q--;
        System.out.println(q);
        System.out.println(p);
        System.out.println(w);
        System.out.println("-------------");

        int u = 88;
        char ch = (char) u;
        System.out.println(u);
        System.out.println(ch);
        System.out.println("-------------");

        int s = 55;
        double d = s;
        System.out.println(s);
        System.out.println(d);
        System.out.println("-------------");

        double df = 757.73;
        System.out.println(df);
        int g = (int) df;
        System.out.println(g);
        System.out.println("-------------");

        int t = 55;
        double k = t + 11;
        System.out.println(t);
        System.out.println(k);
        System.out.println("-------------");

        double az = 757.73;
        System.out.println(az);
        int gu = (int) az + 100;
        System.out.println(gu);
        System.out.println("-------------");


    }
}
