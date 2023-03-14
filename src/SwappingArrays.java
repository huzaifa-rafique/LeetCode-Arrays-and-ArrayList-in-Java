import java.util.Arrays;
public class SwappingArrays {
    public static void main (String[] args){
        int[] arr = {20,3,4,12,66,74,21,467,763};

        System.out.println("Before: " + Arrays.toString(arr));

//        reverseIndexesFromRange(arr, 1,4);
//        System.out.println(Arrays.toString(arr));

//        swapWholeArray(arr);
//        System.out.println(Arrays.toString(arr));

        swapIndexesInArray(arr, 3, 8);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseIndexesFromRange(int[] arr, int start, int end){
        for (int i = start,  j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void swapWholeArray(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    static void swapIndexesInArray(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
