public class ThisKeyword {

    private int a , b;  //

    public void show(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void display(){
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.show(45, 876);
        obj.display();
    }
}

