public class ArrIndex {
    public static void main (String[] args) {
        int arr[] = {11, 22, 33, 44, 55, 66};

        try{
            System.out.println(arr.length);
            System.out.println(arr[arr.length-3]);
            System.out.println(arr[8]);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Exception occured");
        }

        System.out.println("Code Rumored and Starts");
    }
}

