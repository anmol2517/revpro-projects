public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        for(int i:arr) System.out.print(i+" ");
    }
}
