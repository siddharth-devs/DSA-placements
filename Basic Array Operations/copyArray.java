import java.util.Arrays;

public class copyArray {
    public static void copyArrayto(int[] a, int[] b){
        for(int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        
    }

    public static void main(String[] args) {
        int[] a = {1,2,5,6,7};
        int[] b = new int[a.length];
        
        copyArrayto(a, b);
        System.out.println(Arrays.toString(b));
    }
}
