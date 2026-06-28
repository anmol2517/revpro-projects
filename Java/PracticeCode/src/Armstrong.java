public class Armstrong {
    public static void main(String[] args) {
        int n = 153, t = n, s = 0;
        while (t > 0) {
            int d = t % 10;
            s += d*d*d;
            t /= 10;
        }
        System.out.println(s == n ? "Armstrong" : "Not");
    }
}
