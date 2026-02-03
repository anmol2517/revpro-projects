public class ThreadifyPriority{
    public static void main(String[] args){

        System.out.println();

        Share sh = new Share();
        Send se =  new Send();
        Delivery del = new Delivery();

        sh.setPriority(Thread.MIN_PRIORITY);
        se.setPriority(Thread.NORM_PRIORITY);
        del.setPriority(Thread.MAX_PRIORITY);

        sh.start();
        se.start();
        del.start();
    }
}

class Share extends Thread{
    public void run(){
        System.out.println("Thread Share priority : " + getPriority());
    }
}

class Send extends Thread{
    public void run(){
        System.out.println("Thread Send priority : " + getPriority());
    }
}

class Delivery extends Thread{
    public void run(){
        System.out.println("Thread Delivery priority : " + getPriority());
    }
}
