public class Palindrome {
    public static void main(String[] args) {
        String s1 = "nitin";

        String rev = new StringBuilder(s1).reverse().toString();
        System.out.println(s1.equals(rev) ? "ana" : "non-ana");
    }
}
