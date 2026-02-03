public class Main {
    public static void main(String[] args) {

        int i = 1;
        int j = 10;

        System.out.println("-----WHILE-----");

        while (i <= 8) {
            System.out.println(i);
            i = i+2;
            // i++;
        }

        System.out.println("-----");

        while (j >= 1) {
            System.out.println(j);
            // j--;
            j = j - 3;
        }

        System.out.println("-----DO WHILE-----");

        int a = 13;
        int b = 10;

        do {
            System.out.println("Value of a is " + a);
            a++;
        }
        while(a <= 11);

        // while(i <= 21);  - output : 13 14 15 16 17 18 19 20 21

        do{
            System.out.println(b);
            b--;
        }
        while(b >= 1);

        System.out.println("-----FOR LOOP-----");

        for(int x = 1; x <= 10; x++) {
            System.out.println(x);
        }

        System.out.println("-----");

        for(int y = 10; y >= 1; y--) {
            System.out.println(y);
        }

        System.out.println("-----");

        for(int z = 11; z <= 19; z = z + 2) {
            System.out.println(z);
        }
    }
}
