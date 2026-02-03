public class MethodKeyword {

    private int p, q;   // instance variables


    // constructor

    public MethodKeyword(int p, int q) {
        this.p = p;
        this.q = q;
    }


    //  method

    public void display() {
        System.out.println("Value of p is : " + p);
        System.out.println("Value of q is : " + q);
    }

     //  main method

    public static void main(String[] args) {


        // constructor call

        MethodKeyword mk = new MethodKeyword(25, 10);


        mk.display();
    }
}
