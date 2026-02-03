public class Join {
    public static void main(String[] args){

        System.out.println("Threads Starts..");


        A a = new A();
        B b = new B();
        C c = new C();

        a.start();
        b.start();
        c.start();

        try{
            a.join();
            b.join();
            c.join();
        }catch(Exception e){

        }

        System.out.println("Threads Ends..");
    }
}

class App extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("A : " + i);
        }
    }
}

class Bob extends Thread{
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("B : " + i);
        }
    }
}

class Cap extends Thread{
    public void run() {
        for (int i = 21; i <= 30; i++) {
            System.out.println("C : " + i);
        }
    }
}

