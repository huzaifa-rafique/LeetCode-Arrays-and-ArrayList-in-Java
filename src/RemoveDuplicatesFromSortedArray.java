public class RemoveDuplicatesFromSortedArray {
    public static void main (String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
}
