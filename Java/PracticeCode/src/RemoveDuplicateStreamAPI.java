import java.util.*;
import java.util.stream.*;

public class RemoveDuplicateStreamAPI {

    public static void main(String[] args) {
        String[] arr = {"anmol", "apple", "grapes", "apple"};

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        List<Integer> result = new ArrayList<>(
                list.stream().distinct().toList()
        );

        List<String> r2 = Arrays.stream(arr)
                .distinct()
                .toList();

        System.out.println(result);
        System.out.println(r2);
    }
}



