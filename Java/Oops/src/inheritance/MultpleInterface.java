package inheritance;


// Interface 1

interface First {
    void showFirst();
}


// Interface 2

interface Second {
    void showSecond();
}


// Interface 3

interface Third {
    void showThird();
}


// Class implementing 3 interfaces (multiple inheritance)

class Demo implements First, Second, Third {

    public void showFirst() {
        System.out.println("First interface");
    }

    public void showSecond() {
        System.out.println("Second interface");
    }

    public void showThird() {
        System.out.println("Third interface");
    }
}


// Main class

public class MultpleInterface {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.showFirst();
        d.showSecond();
        d.showThird();
    }
}

