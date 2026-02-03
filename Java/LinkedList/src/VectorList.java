import java.util.*;

import java.util.Vector;

public class VectorList {
    public static void main(String[] args) {
        Vector v = new Vector(10, 1);

        System.out.println("By Default Capacity : " + v.capacity());

        for(int i = 1; i <= 10; i++){
            v.addElement(i);
        }
        System.out.println(v);

        v.addElement(11);

        System.out.println("Updated Capacity : " + v.capacity());
        System.out.println(v);
    }
}
