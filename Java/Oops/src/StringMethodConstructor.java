public class StringMethodConstructor {

    private int id;
    private String name, city;

    public StringMethodConstructor(int id , String name , String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public void display(){
        System.out.println("Agent Id is : " + id);
        System.out.println("Agent Name is : " + name);
        System.out.println("Agent Present City is : " + city);
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("---------------------ALERT---------------------");
        System.out.println();
        System.out.println("This information will be displayed but it is confidential then don't share anyone!");
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("---------------------ALERT---------------------");
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


    public String getName(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }


    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    public static void main(String[] args) {
        StringMethodConstructor smc = new StringMethodConstructor(257, "James Bond", "San Francisco");
        smc.display();
    }
}

