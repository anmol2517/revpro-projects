package inheritance;

class Develop {
    public int i, j;

    public void showdev(){
        System.out.println("Value of i is : " + i);
        System.out.println("Value of j is : " + j);
    }
}

class Air extends Develop {
    public int k;        //  Variable Declare
    public void showair(){
        System.out.println("Value of k is : " + k);
    }

    public void sum(){   //   Method Create
        int s = i + j + k;
        System.out.println(i + j + k);
        System.out.println("Value of s is : " + s);
    }
}

public class Single {
    public static void main(String[] args) {
        Air a = new Air();

        a.i = 25;
        a.j = 35;
        a.showdev();

        a.k = 45;
        a.showair();
        a.sum();
    }
}
