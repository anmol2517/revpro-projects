import java.util.*;

public class ArrayListSecondHighest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 50, 14));

        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size()-2));
    }
}
