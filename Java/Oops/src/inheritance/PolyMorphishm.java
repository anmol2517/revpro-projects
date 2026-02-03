package inheritance;

class Play{
    public void show(int x, int y){
        int z = x + y;
        System.out.println("Sum is : " + z);
    }
}

class Pause extends Play{
    public void show(int x, int y){
        int z = x - y;
        System.out.println("Subratction is : " + z);
    }
}

class Extension extends Play{
    public void show(int x, int y){
        int z = x * y;
        System.out.println("Multiplication is : " + z);
    }
}

class Service extends Play{
    public void show(int x, int y){
        int z = x / y;
        System.out.println("Division is : " + z);
    }
}

public class PolyMorphishm {
    public static void main(String[] args) {

        Play pl = new Play();
        pl.show(11 , 22);

        Pause pu = new Pause();
        pu.show(33, 44);

        Extension ext = new Extension();
        ext.show(55, 44);

        Service srv = new Service();
        srv.show(66, 22);

        int x = 111;        //  Inbuilt Data Type
        Play refer = pl;     // User Defined Data Type

        System.out.println("Value of x is : " + x);

        /*
           we also write like that (ref.show)
        */

    }
}

