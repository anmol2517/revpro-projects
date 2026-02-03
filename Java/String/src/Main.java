//  String is Immutable it means does not change and size not fixed

public class Main{
    public static void main(String[] args) {

        // String s = new String("cnc");   //  SCP Area or Heap Area (using new)

        String s = "cnc";   //  SCP Area

        s = s.concat("web");

        System.out.println(s);
    }
}
