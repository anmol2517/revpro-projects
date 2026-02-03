package constructors;

public class PrivateCons {
    private PrivateCons(){
        System.out.println("Private Constructor");
    }
    public static void main(String[] args) {
        new PrivateCons();
    }
}

/*
    private PrivateCons()  --> this is a private constructor

    A private constructor can be accessed
    if it is called from within the SAME class.

    main() method is inside the same class,
    therefore the private constructor is accessible here.
*/
