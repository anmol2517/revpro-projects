package inheritance;

class Level{
    public int x;

    public void showx(){
        System.out.println("Value of x is : " + x);
    }
}

class Able extends Level{
    public int y;

    public void showy(){
        System.out.println("Value of y is : " + y);
    }
}

class Unable extends Able {
    public int z;
    public void showz(){
        System.out.println("Value of z is : " + z);
    }
}

class Youlevel extends Unable{
    public void sum(){
        int s = x + y + z;
        System.out.println("Value of s is : " + s);
    }
}

public class MultiLevel {
    public static void main(String[] args) {

        Youlevel yl = new Youlevel();
        yl.x = 5;
        yl.showx();

        yl.y = 15;
        yl.showy();

        yl.z = 25;
        yl.showz();

        yl.sum();
    }
}

