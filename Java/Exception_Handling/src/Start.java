public class Start {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7};

        try {
            System.out.println(a[8]);
        }

        //  Using this  :  ArrayIndexOutOfBoundsException

        //  Or if we don't know then using general Exception


        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }


        catch(NullPointerException npe) {
            System.out.println(npe.getMessage());
        }

        catch(IllegalArgumentException lea) {
            System.out.println(lea.getMessage());
        }

        catch(Exception aec) {
            System.out.println(aec.getMessage());
        }

        System.out.println("Problem Continues!");
    }
}

