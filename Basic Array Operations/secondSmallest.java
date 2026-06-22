public class secondSmallest {
    public static int secondSmallestEle(int[] arr){
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secondSmall = small;
                small = arr[i];
            }
            if(arr[i]>small && arr[i]<secondSmall){
                secondSmall = arr[i];
            }
        }
        if(secondSmall == Integer.MAX_VALUE){
            return -1;
        }
        return secondSmall;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,3,2,7};
        int n = secondSmallestEle(arr);
        System.out.println(n);
    }
}
