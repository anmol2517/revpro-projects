import java.util.*;

public class AvgSalaryUsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50000, 25000, 35000));
        double avg = list.stream().mapToInt(i -> i).average().getAsDouble();
        System.out.println(avg);
    }
}
