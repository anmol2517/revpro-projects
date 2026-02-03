import java.util.*;

public class IteratorCollect {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(270);
        al.add(67);
        al.add(51.08);
        al.add(62.38);
        al.add("Spring Boot");
        al.add(95);
        al.add(null);

        System.out.println(al);
        System.out.println("Size of al is : " + al.size());

        al.remove(1);
        System.out.println("Then removal size of al is : " + al.size());

        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-------------");

        ListIterator lit = al.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("-------------");

        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }

    }
}
