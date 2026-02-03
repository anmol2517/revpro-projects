import java.util.*;

public class ObjAdd {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        System.out.println("Size of al is : " + al.size());

        al.add(1.4);
        al.add(51.62);
        al.add("Java");
        al.add(85);

        System.out.println(al);
        System.out.println("After addition size of al is : " + al.size());

        al.remove(3);
        System.out.println("After removal size of al is : " + al.size());

        for(Object x: al){
            System.out.println(x);
        }

        al.add(41);
        System.out.println(al);
    }
}
