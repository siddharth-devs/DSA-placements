public class lastOcc {
    public static int lastOccur(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;

        int ans = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(target == nums[mid]){
                ans = mid;
                s = mid+1;
            } else if(target>nums[mid]){
                s = mid+1;
            } else{
                e = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,7,7,7,9};
        int target = 7;
        System.out.println(lastOccur(nums, target));
    }
}
