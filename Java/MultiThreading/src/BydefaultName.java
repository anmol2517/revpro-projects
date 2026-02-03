public class BydefaultName {

    public static void main(String[] args){

        // System.out.println(Thread.currentThread().getName());
        // Thread.currentThread().setName("Ganpat Rao");
        // System.out.println("Updated / New Name is : " + Thread.currentThread().getName());

        Anm a = new Anm();
        Bnm b = new Bnm();
        Cnm c = new Cnm();

        a.start();
        b.start();
        c.start();

    }
}

class Anm  extends Thread {
    public void run(){
        // System.out.println("Default name is : " + Thread.currentThread().getName());

        Thread.currentThread().setName("Atma Ram Tuka Ram Bhide");
        System.out.println("Updated / New Name is A : " + Thread.currentThread().getName());
    }
}

class Bnm  extends Thread {
    public void run(){
        // System.out.println("Default name is : " + Thread.currentThread().getName());

        Thread.currentThread().setName("Baburao");
        System.out.println("Updated / New Name is B : " + Thread.currentThread().getName());
    }
}

class Cnm  extends Thread {
    public void run(){
        // System.out.println("Default name is : " + Thread.currentThread().getName());

        Thread.currentThread().setName("Chandu Chamkila");
        System.out.println("Updated / New Name C is : " + Thread.currentThread().getName());
    }
}

