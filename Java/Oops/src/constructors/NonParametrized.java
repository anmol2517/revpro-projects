package constructors;

public class NonParametrized {


    //  Non-parameterized constructor

    private NonParametrized() {
        System.out.println("It is Non Parameterized Constructor");
    }


    //  Parameterized constructor (int, String)

    private NonParametrized(int id, String name) {
        System.out.println("It is Parameterized Constructor");

        System.out.println("Agent Id is : " + id);
        System.out.println("Agent Name is : " + name);
    }


    //  Public constructor with int

    public NonParametrized(int id) {
        System.out.println("Public Constructor with Id : " + id);
    }


    //  Public constructor with String

    public NonParametrized(String name) {
        System.out.println("Public Constructor with Name : " + name);
    }

    public static void main(String[] args) {

        new NonParametrized();                               //  private non-parameterized
        new NonParametrized(25, "JethaLal");      //   private parameterized

        new NonParametrized(11);                      //   public int
        new NonParametrized("James Bond");        //    public String
    }
}

