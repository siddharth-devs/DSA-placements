import java.util.Arrays;

public class countEvenAndOdd {
    public static int[] countEvenOdd(int[] arr){
        int countEven = 0;
        int countOdd = 0;
        for(int num:arr){
            if(num%2==0){
                countEven+=1;
            } else{
                countOdd+=1;
            }
        }
        return new int[]{countOdd, countEven};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,9,8};

        System.out.println(Arrays.toString(countEvenOdd(arr)));
    }
}
