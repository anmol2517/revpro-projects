import java.util.*;

public class CollectionsSecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 22, 33, 25);
        Collections.sort(list);
        System.out.println(list.get(list.size()-2));
    }
}
