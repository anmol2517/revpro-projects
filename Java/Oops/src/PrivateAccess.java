public class PrivateAccess {
    private int x, y;    //  Instance Variable

    public void display(int a, int b) {
        x = a;
        y = b;
    }

    public void show(){
        System.out.println("Value of x is : " + x);
        System.out.println("Value of y is : " + y);
    }

    public static void main(String[] args) {
        PrivateAccess obj = new PrivateAccess();
        obj.display(20, 30);
        obj.show();
    }
}
