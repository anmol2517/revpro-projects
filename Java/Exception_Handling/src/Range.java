public class Range {
    public static void main(String[] args){

        int a = 12;
        int b = 3;
        int c = 14;
        int d = 0;

        try{
            int e = c / d;

            System.out.println("Value of e is : " + e);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Not Possible (c/d)");
        }
        System.out.println("Program Continues");
    }
}
