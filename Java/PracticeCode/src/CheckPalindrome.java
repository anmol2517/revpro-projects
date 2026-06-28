public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 1215;
        int rev = 0;
        int copy = n;

        while(copy > 0){
            int d = copy % 10;
            rev = rev * 10 + d;
            copy /= 10;
        }


        //  String r = new  StringBuilder(rev).reverse().toString();


        if(rev == n){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
