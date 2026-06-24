public class searchInsertPosition {
    public static int searchPosition(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = (s+e)/2;
            if(target>arr[mid]){
                s = mid+1;
            }
            else if(target<arr[mid]){
                e = mid-1;
            }
            else if(target == arr[mid]){
                return mid;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchPosition(arr, target));
    }
}
