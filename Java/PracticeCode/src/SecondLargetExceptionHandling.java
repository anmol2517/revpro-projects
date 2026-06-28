import java.util.*;

public class SecondLargetExceptionHandling {
    public static void main(String[] args) {


        try {
            System.out.println(
                    Arrays.asList(10, 20, 30, 40, 50)
                            .stream()
                            .sorted(Comparator.reverseOrder())
                            .skip(1).findFirst().get()
            );
        } catch(Exception e) {
            System.out.println("error");
        }
    }
}
