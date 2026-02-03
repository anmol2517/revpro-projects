package inheritance;


//  Method Overriding  :  Same method name with same parameter


class Easy{
    public void show(int x, int y){
        int z = x + y;
        System.out.println("Sum is : " + z);
    }
}

class Medium extends Easy{
    public void show(int x, int y){
        int z = x - y;
        System.out.println("Subratction is : " + z);
    }
}

class Hard extends Easy{
    public void show(int x, int y){
        int z = x * y;
        System.out.println("Multiplication is : " + z);
    }
}

class Advance extends Easy{
    public void show(int x, int y){
        int z = x / y;
        System.out.println("Division is : " + z);
    }
}

public class Hierachy {
    public static void main(String[] args) {

        Easy e = new Easy();
        e.show(11 , 22);

        Medium m = new Medium();
        m.show(33, 44);

        Hard h = new Hard();
        h.show(55, 44);

        Advance a = new Advance();
        a.show(66, 22);
    }
}

