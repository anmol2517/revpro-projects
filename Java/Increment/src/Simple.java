public class Simple {
    public static void main (String[] args){
        int a = 22;
        int b = 33;
        int c;
        int d;

        c = a++ + b++ + ++a + ++b;
        d = a-- - b-- - --a - --b;

        int x = 44;
        int y = ++x;
        int l = x++;

        int p = 77;
        int q = p++;

        double k = 26.32;
        float f = (float) k;

        int s = 65;
        double h = (int) s;

        int e = 43;
        double j = --e;
        double o = e--;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("------------");
        System.out.println(x);
        System.out.println(y);
        System.out.println(l);
        System.out.println("------------");
        System.out.println(p);
        System.out.println(q);
        System.out.println("------------");
        System.out.println(k);
        System.out.println(f);
        System.out.println("------------");
        System.out.println(s);
        System.out.println(h);
        System.out.println("------------");
        System.out.println(e);
        System.out.println(j);
        System.out.println(o);
    }
}
