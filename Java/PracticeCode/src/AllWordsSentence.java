public class AllWordsSentence {
    public static void main(String[] args) {
        String s = "hello world java code";
        String[] words = s.split(" ");
        for(String w : words) System.out.println(w);
    }
}
