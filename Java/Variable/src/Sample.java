public class Sample {
    int x = 667;
    String name = "anmoL";

    static int c = 55;

    public static void main(String[] args){
        Sample obj = new Sample();

        System.out.println(obj.x);
        System.out.println(obj.name);

        System.out.println("-------------");

        System.out.println(obj.c);
        Sample.c++;
        System.out.println(obj.c);

        System.out.println("-------------");

        int locaVar = obj.x;
        System.out.println(locaVar);

        int localVariable = 24 + obj.x;
        System.out.println(localVariable);
    }
}