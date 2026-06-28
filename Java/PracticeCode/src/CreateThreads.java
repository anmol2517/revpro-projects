import java.util.*;

class A extends Thread{
    public void run(){
        System.out.println("run");
    }
}

class B extends Thread{
    public void run(){
        try{
            Thread.sleep(5000);
            System.out.println("delay");
        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}

public class CreateThreads{
    public static void main(String[] args){
        new A().start();
        new B().start();
    }
}
