import java.util.*;

public class RemoveChar {
    public static void main(String[] args) {
        String s = "hello anmol code";

        String result = s.replaceAll("\\s", "");

        String res = s.substring(4);

        String r = s.substring(0, s.length() - 2);


        System.out.println(result);
        System.out.println(res);
        System.out.println(r);
    }
}