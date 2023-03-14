import java.util.*;
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 4, 5};
        RemoveDuplicatesSortedArray removeDuplicates = new RemoveDuplicatesSortedArray();
        int length = removeDuplicates.removeDuplicates(nums);
        System.out.println("Length of the array after removing duplicates: " + length);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int addIndex = 1; //index that unique characters will be inserted at

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1]) { //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        return addIndex;
    }
}
