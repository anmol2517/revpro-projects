class TheSync extends Thread{
    public void run() {
        System.out.print("Hello World");

        try{
            Thread.sleep(3000);
        } catch(Exception e){
            System.out.println(e);
        }

        System.out.println(" - MultiThreading..!");
    }
}

public class ThreadSync {
    public static void main(String[] args) throws Exception {
        TheSync ts = new TheSync();

        ts.start();
    }
}

