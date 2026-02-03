package inheritance;


class Multicircle {

    private int x;

    Multicircle(int x){
        this.x = x;
    }

    public int getx(){
        return x;
    }

    public void showx(){
        System.out.println("Value of x is : " + x);
    }
}

class Multicircle2 extends Multicircle {
    private int y;

    Multicircle2(int x,int y){

        super(x);
        this.y = y;
    }

    public int gety(){
        return y;
    }

    public void showy(){
        System.out.println("Value of y is : " + y);
    }
}

class Multicircle3 extends Multicircle2 {
    private int x, y, z;

    Multicircle3(int x, int y, int z) {

        super(x, y);
        this.z = z;
    }

    public int getz() {
        return z;
    }

    public void showz() {
        System.out.println("Value of z is : " + z);
    }

    public void sum(){
        int w = getx() + gety() + getz();
        System.out.println("Sum is : " + w);
    }
}

public class MultpleInherit {
    public static void main(String[] args) {

        Multicircle3 mc3 = new Multicircle3(22,  33 , 44);

        mc3.showx();
        mc3.showy();
        mc3.showz();
        mc3.sum();
    }
}

