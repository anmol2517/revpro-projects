public class ReverseIntExceptionHandling {
    public static void main(String[] args) {
        int n = 123456;

        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();

        int result = Integer.parseInt(sb.toString());
        System.out.println(result);
    }
}
