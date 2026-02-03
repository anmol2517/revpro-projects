package constructors;

class Test {
    public void show(){
        System.out.println("Its Just A Methods");
    }

    public Test(){
        System.out.println("Its Just A Methods Constructor" );
    }
}
public class Main {
    public static void main(String[] args) {
        new Test();    //   We are also create a object this technique
    }
}

/*
     new Test();  ->>  here create a object and after
     automatically constructor calling

     show() - this line not calling automaticaly

     if we want to print show() part then we write this code

     Test t = new Test();   ---       constructor call
     t.show();              ---       method call
*/

