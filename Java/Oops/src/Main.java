public class Main {

    public static void main(String[] args) {

        Method hp = new Method();
        hp.x = 152;
        hp.show();

        Test t = new Test();     // Test class object
        t.test();               // test() method call
    }
}


/*

public class Main {

    int x;

    public void show() {
        System.out.println("Hello World!");
        System.out.println("Value of x is : " + x);
    }

    public void sum(int a, int b) {
        int c = a + b;
        System.out.println("Sum is: " + c);
    }

    public static void main(String[] args) {

        Main obj = new Main();  // ek hi object
        obj.x = 152;
        obj.show();
        obj.sum(25, 52);
    }
}

 */