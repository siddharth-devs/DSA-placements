public class avgOfArray {
    public static int avgArray(int[] arr){
        int sum = 0;
        for(int num:arr){
            sum+=num;
        }
        int avg = sum/arr.length;
        return avg;
    }
}
