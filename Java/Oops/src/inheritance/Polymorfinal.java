package inheritance;


// Parent class

class Bank {
    final String bankName = "State Bank of India";

    public void showInterest() {
        System.out.println("Bank provides basic interest");
    }
}


// Child class

class Account extends Bank {
    final int accountNumber = 12345;

    @Override
    public void showInterest() {
        System.out.println("Savings Account Interest: 6%");
    }

    public void showDetails() {
        System.out.println("Bank Name : " + bankName);
        System.out.println("Account No : " + accountNumber);
    }
}


// Main class

public class Polymorfinal {
    public static void main(String[] args) {

        Bank b = new Account();   // polymorphism
        b.showInterest();

        Account a = new Account();
        a.showDetails();
    }
}
