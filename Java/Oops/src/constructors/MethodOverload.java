package constructors;

class Code {
    public void Universe(){
        System.out.println("Hello World!");
    }

    public void Universe(int x){
        System.out.println("Value of x is : " + x);
    }

    public void Universe(int x , int y){
        int z = x + y;
        System.out.println("Sum is : " + z);
    }

    public double Universe(double x){
        return x * x;
    }
}

public class MethodOverload {
    public static void main(String[] args) {

        Code code1 = new Code();

        System.out.println(code1.Universe(code1.Universe(25.21)));    //  double

        code1.Universe(11);       //   int x

        code1.Universe(17, 25);    //  int x , y

        code1.Universe();       //  empty calling - hello world
    }
}


//   Method Overloading :  Same methods name with different parameter
//   Constructor Method :  Same class name with different parameter
//   Method Overriding  :  Same method name with same parameter
//   Void means no return type
