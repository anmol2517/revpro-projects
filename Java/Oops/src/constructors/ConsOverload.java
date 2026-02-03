package constructors;

class Sample {
    private int s, d;
    private String game;

    Sample() {
        System.out.println("-----Sample Constructor Code-----");
        s = 45567;
        d = 87676;
        game = "Football";
    }

    Sample (int s){
        this.s = s;
    }

    Sample (int s , int d){
        this.s = s;
        this.d = d;
    }

    Sample (int s , int d, String game ){
        this.s = s;
        this.d = d;
        this.game = game;
    }

    public void show(){
        System.out.println("Value of s is : " + s);
        System.out.println("Value of d is : " + d);
        System.out.println("Value of game is : " + game);
    }
}

public class ConsOverload {
    public static void main(String[] args) {

        Sample sam1 = new Sample();

        Sample sam2 = new Sample(234);

        Sample sam3 = new Sample(876, 668);

        Sample sam4 = new Sample(976, 765, "Tennis");

        sam1.show();
        System.out.println("-----------");
        sam2.show();
        System.out.println("-----------");
        sam3.show();
        System.out.println("-----------");
        sam4.show();
    }
}

