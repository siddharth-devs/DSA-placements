public class checkSortedArray {
    public static boolean checkArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,26,4,58,6};
        System.out.println(checkArray(arr));
    }
}
