import java.util.*;

public class StreamAPISecondHighestSalary {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2500, 20000, 35000, 43000);

        int second = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();

        System.out.println(second);
    }
}
