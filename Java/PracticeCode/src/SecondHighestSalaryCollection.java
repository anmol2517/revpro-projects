import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalaryCollection{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 11, 13);

        int second = list.stream().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();

        System.out.println(second);
    }
}