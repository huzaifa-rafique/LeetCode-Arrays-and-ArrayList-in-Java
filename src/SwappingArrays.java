import java.util.Arrays;

public class SwappingArrays {
    public static void main (String[] args){
        int[] arr = {20,3,4,12,66,74,21,467,763};

        System.out.println(Arrays.toString(arr));
        swapIndexesFromRange(arr, 1,4);
        System.out.println(Arrays.toString(arr));
    }

    static void swapIndexesFromRange(int[] arr, int start, int end){
        for (int i = start,  j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


}
