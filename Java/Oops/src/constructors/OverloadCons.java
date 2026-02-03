package constructors;

class Demo {
    private String programmingLanguage;
    private int serialnum;
    private String framework;

    Demo() {
        this.programmingLanguage = "C++";
        this.serialnum = 21;
    }

    Demo(String programmingLanguage, int serialnum) {
        this.programmingLanguage = programmingLanguage;
        this.serialnum = serialnum;
    }

    Demo(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    Demo(String programmingLanguage, int serialnum, String framework) {
        this.programmingLanguage = programmingLanguage;
        this.serialnum = serialnum;
        this.framework = framework;
    }

    void display(){
        System.out.println(programmingLanguage);
        System.out.println(serialnum);
        System.out.println(framework);
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.display();

        System.out.println("---------");

        Demo d2 = new Demo("Python" , 23);
        d2.display();

        System.out.println("---------");

        Demo d3 = new Demo("Node.js");
        d3.display();

        System.out.println("---------");

        Demo d4 = new Demo("Java" , 25, "Spring Boot");
        d4.display();
    }
}

//  Default Value Print Null : 0
//  Same class but different parameter pass

