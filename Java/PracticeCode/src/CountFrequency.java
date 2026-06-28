public class CountFrequency {
    public static void main(String[] args) {
        String s = "anmool coder";
        char target = 'o';

        long count = s.chars().filter(c -> c == target).count();
        System.out.println(count);
    }
}
