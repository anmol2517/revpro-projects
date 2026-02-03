import java.util.*;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.add(31);
        list.add("java");
        list.add("25.10");
        list.add(null);
        list.add("java");  // Duplicate Entry Allow (int, string, float)

        System.out.println(list);

        list.set(1, "spring boot");
        list.set(2, 10.25);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.addFirst("hibernate");
        list.addLast(83.68);
        System.out.println(list);
    }
}
