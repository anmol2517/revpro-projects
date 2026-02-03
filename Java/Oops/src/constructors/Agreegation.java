package constructors;

class Address {
    public String city, state, country;

    Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void display() {
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Country : " + country);
    }
}

class Level {
    public int emp_id;
    public String emp_name;


    // Address it is a class name but using as a DataType adr
    //  This is reference variable

    Address adr;     //   Aggregation


    Level(int emp_id, String emp_name, Address adr) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.adr = adr;
    }

    public void display() {
        System.out.println("Employee ID : " + emp_id);
        System.out.println("Employee Name : " + emp_name);
        System.out.println("City : " + adr.city);
        System.out.println("State : " + adr.state);
        System.out.println("Country : " + adr.country);
    }
}

class Student {
    int roll;
    public String name;
    Address adr;

    Student(int roll, String name, Address adr) {
        this.roll = roll;
        this.name = name;
        this.adr = adr;
    }

    public void display() {
        System.out.println("Student Roll : " + roll);
        System.out.println("Studen Name : " + name);
        System.out.println("City : " + adr.city);
        System.out.println("State : " + adr.state);
        System.out.println("Country : " + adr.country);
    }
}

public class Agreegation {
    public static void main(String[] args) {

        Address adr1 = new Address("Pune", "Maharashtra", "India");

        Address adr2 = new Address("Gurugram", "Haryana", "India");

        Student s1 = new Student(33, "Krishnan Subramanyam Iyer", adr1);


        Level le1 = new Level(11, "Jethalal Champaklal Gada", adr1);

        Level le2 = new Level(22, "Aatma Ram Tuka Ram Bhide", adr2);


        le1.display();
        System.out.println("________________________");
        le2.display();
        System.out.println("________________________");
        s1.display();
    }
}
