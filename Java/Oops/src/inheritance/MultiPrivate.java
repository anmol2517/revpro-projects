package inheritance;

class PrivateML{
    private int x;

    public void setx (int x){
        this.x = x;
    }

    public int getx(){
        return x;

    }

    public void showx(){
        System.out.println("Value of x is : " + x);
    }
}

class Lanes extends PrivateML{
    private int y;

    public void sety (int y){
        this.y = y;
    }

    public int gety(){
        return y;

    }

    public void showy(){
        System.out.println("Value of y is : " + y);
    }
}

class kevel extends Lanes {
    private int z;

    public void setz (int z){
        this.z = z;
    }

    public int getz(){
        return z;

    }

    public void showz(){
        System.out.println("Value of z is : " + z);
    }
}

class Showlevel extends kevel{
    public void sum(){
        int s = getx() + gety() + getz();
        System.out.println("Value of s is : " + s);
    }
}

public class MultiPrivate {
    public static void main(String[] args) {

        Showlevel sl = new Showlevel();

        sl.setx(5);
        sl.showx();

        sl.sety(15);
        sl.showy();

        sl.setz(25);
        sl.showz();

        sl.sum();
    }
}

