
public class binarySearch {
    public static int searchbinary(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s + (e - s) / 2;
            if(target>arr[mid]){
                s=mid+1;
            }
            else if(target<arr[mid]){
                e=mid-1;
            }
            else if(target==arr[mid]){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,25};
        int target = 9;
        System.out.println(searchbinary(arr, target));
    }
}
