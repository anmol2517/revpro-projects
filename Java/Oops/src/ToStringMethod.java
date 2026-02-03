public class ToStringMethod {

    private int id;
    private String name, role;


    public ToStringMethod(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }


    //      Override

    public String toString(){
        return "ToStringMethod [ id = " + id +
                " , name = " + name + " , role = " + role + "]";
    }

    public static void main(String[] args) {
        ToStringMethod smc = new ToStringMethod
                (171, "Trump", "President of USA");   // Memory Allocate

        System.out.println(smc);
    }
}

