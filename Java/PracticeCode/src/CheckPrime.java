public class CheckPrime {
    public static void main(String[] args) {
        int n = 19;

        boolean prime = true;

        if (n <= 1) prime = false;

        for (int i = 2; i < n; i++){
            if(n % i == 0){
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "prime" : "not prime");
    }
}
