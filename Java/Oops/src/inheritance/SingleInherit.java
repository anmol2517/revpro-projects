package inheritance;


// Parent class

class Things {
    private int p, q;

    public void showdev(int p, int q) {
        this.p = p;
        this.q = q;
    }

    public int getp() {
        return p;
    }

    public int getq() {
        return q;
    }

    public void show() {
        System.out.println("Value of p is : " + p);
        System.out.println("Value of q is : " + q);
    }
}


// Child class (Single Inheritance)


class Values extends Things {

    public void sum() {
        int result = getp() + getq();     //  accessing via getter

        System.out.println("Sum is : " + result);
    }
}


public class SingleInherit {
    public static void main(String[] args) {

        Values v = new Values();          // child class object

        v.showdev(10, 20);         // parent class method

        v.show();                        // parent class method
        v.sum();                         // child class method
    }
}

