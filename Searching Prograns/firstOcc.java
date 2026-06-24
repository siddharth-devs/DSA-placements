public class firstOcc {
    public static int firstOccur(int[] nums, int k){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;

        while(s<=e){
            int mid = (s+e)/2;

            if(k == nums[mid]){
                ans = mid;
                e = mid-1;
            }
            else if(k>nums[mid]){
                s = mid+1;
            } else{
                e = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int k = 4;
        System.out.println(firstOccur(nums, k));
    }
    
}
