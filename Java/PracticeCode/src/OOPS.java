class Ai {  // Encapsulation
    private int x;

    void set(int x) { this.x = x; }
    int get() { return x; }

    void show() { System.out.println("Ai"); }  // Polymorphism
}

class Bi extends Ai {  // Inheritance
    void show() { System.out.println("Bi"); }  // Polymorphism (Overriding)
}

public class OOPS {
    public static void main(String[] args) {

        Ai obj = new Bi();  // Abstraction + Polymorphism

        obj.set(10);  // Encapsulation
        System.out.println(obj.get());  // Encapsulation

        obj.show();  // Polymorphism
    }
}
