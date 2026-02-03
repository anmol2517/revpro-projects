package constructors;

public class Parametrized {

    private int id;
    private String name;

    //   Parameterized constructor (int, String)
    private Parametrized(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("It is Parameterized Constructor");
        System.out.println("Agent Id is : " + this.id);
        System.out.println("Agent Name is : " + this.name);
    }

    //   Public constructor with int
    public Parametrized(int id) {
        this(id, "Not Assigned");   // constructor chaining
        System.out.println("Public Constructor with Id");
    }


    //   Public constructor with String

    public Parametrized(String name) {
        this(0, name);                   //   constructor chaining
        System.out.println("Public Constructor with Name");
    }

    public static void main(String[] args) {

        new Parametrized(25, "JethaLal");    //  private (int, String)
        System.out.println("------------------");

        new Parametrized(11);                      //  public int
        System.out.println("------------------");

        new Parametrized("James Bond");       //  public String
    }
}
