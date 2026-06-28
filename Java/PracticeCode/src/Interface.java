interface Y{
    void show();
}
class Z implements Y {
    public void show() {
        System.out.println("Interface Method");
    }
}
public class Interface {
    public static void main(String[] args) {
        Y obj = new Z();
        obj.show();
    }
}