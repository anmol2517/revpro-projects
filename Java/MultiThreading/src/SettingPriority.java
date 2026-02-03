class ABC extends Thread{
    public void run(){
        for(int i = 1;; i++){
            System.out.println("ABC : " + i);
        }
    }
}

class PQR extends Thread{
    public void run(){
        for(int i = 1; ; i++){
            System.out.println("PQR : " + i);
        }
    }
}

public class SettingPriority {
    public static void main(String[] args) {
        ABC abc = new ABC();
        PQR pqr = new PQR();

        abc.setPriority(11);
        pqr.setPriority(6);

        abc.start();
        pqr.start();

        try{
            Thread.sleep(3500);
        }catch (Exception e){
            System.out.println(e);
        }

        abc.interrupt();
        pqr.interrupt();
    }
}
