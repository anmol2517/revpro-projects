public class Main{
    public static void main(String[] args){
        Tata t =  new Tata();
        t.hello1();

        Toyota ty =  new Toyota();
        ty.hello2();

        Skoda sk =  new Skoda();
        sk.hello3();
    }
}

class Tata {
    public void hello1(){
        System.out.println("hello World, I'm Tata Group");
    }
}

class Toyota{
    public void hello2(){
        System.out.println("hello Universe, I'm Toyota Group");
    }
}

class Skoda{
    public void hello3(){
        System.out.println("hello Universe, I'm Skoda Group");
    }
}

