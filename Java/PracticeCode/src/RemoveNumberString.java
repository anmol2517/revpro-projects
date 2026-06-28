public class RemoveNumberString {
    public static void main(String[] args) {
        int n = 12345;
        String s = "abcde";

        String k = String.valueOf(n);
        System.out.println(n /10); // last remove
        System.out.println(n % 1000); // first and second remove
        System.out.println(Integer.parseInt(k.substring(1)));  // first remove

        System.out.println(s.substring(1)); // first remove
        System.out.println(s.substring(0, s.length()-1)); // last remove


        int m = 6789;
        int first = m / 1000;
        int last = m % 100;
        System.out.println(first * 100 + last); // second num remove


        String a = "hello";
        System.out.println(a.charAt(0) + a.substring(2)); // second string remove
    }
}
