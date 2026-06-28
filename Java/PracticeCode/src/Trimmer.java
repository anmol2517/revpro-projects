import java.util.*;

public class Trimmer {
    public static void main(String[] args) {

        String str = "   Hello World!   ";

        String trim = str.trim();
        String allRemoved = str.replaceAll("\\s", "");
        String stream = str.chars()
                .filter(c -> !Character.isWhitespace(c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(trim);
        System.out.println(allRemoved);
        System.out.println(stream);
    }
}
