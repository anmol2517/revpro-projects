public class According {
    public static void main(String[] args) {

        try {
            int age = 12;   //   Set a message (self message : if we don't use try & catch method then show this)

            //  int age = 22;   // You can vote

            if(age < 18) {
                throw new ArithmeticException("You can't vote!");
            }
            else {
                System.out.println("You can vote!");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program Continued..!!");
    }
}

