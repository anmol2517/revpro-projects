public class TimerThread {
    public static void main(String[] args) throws Exception {
        Water w = new Water();
        w.show1();

        River r =  new River();
        r.show2();

        Sea s = new Sea();
        s.show3();
    }
}

class Water {
    public void show1() throws Exception{
        for(int i = 1; i <= 3; i++){
            if(i == 2){
                Thread.sleep(5000);
            }
            System.out.println("Water : " + i);
        }
    }
}

class River {
    public void show2()throws Exception {
        for(int i = 4; i <= 6; i++){
            if(i == 4){
                Thread.sleep(5000);
            }
            System.out.println("River : " + i);
        }
    }
}

class Sea {
    public void show3() throws Exception {
        for(int i = 7; i <= 9; i++){
            if(i == 7){
                Thread.sleep(5000);
            }
            System.out.println("Sea : " + i);
        }
    }
}