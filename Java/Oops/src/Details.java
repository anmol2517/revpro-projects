// Method Return Type


import java.util.Scanner;

public class Details {

    //  number calculation method

    public int sum(int a, int s, int d) {
        int w = a + s - d;
        return w;
    }

    //   inner class

    public class Happy {
        public String saysomething(String name) {
            return "Hello " + name;
        }
    }

    public static void main(String[] args) {

        Details obj = new Details();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
        int s = sc.nextInt();

        System.out.print("Enter the third number : ");
        int d = sc.nextInt();

        int result = obj.sum(a, s, d);
        System.out.println(">> Value of c is : " + result);

        System.out.println("------------------");

        sc.nextLine();      // buffer clear

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        Details.Happy hp = obj.new Happy();
        String msg = hp.saysomething(name);
        System.out.println(msg);
    }
}

