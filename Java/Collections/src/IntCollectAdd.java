import java.util.*;

public class IntCollectAdd {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        System.out.println("Size of al is : " + al.size());

        al.add(1);
        al.add(11);
        al.add(21);
        al.add(31);

        System.out.println("After addition size of al is : " + al.size());

        al.remove(3);
        System.out.println("After removal size of al is : " + al.size());

        for(int x:al){
            System.out.println(x);
        }

        al.add(41);
        System.out.println(al);
    }
}
