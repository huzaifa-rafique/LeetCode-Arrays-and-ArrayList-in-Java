import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] indices = twoSum.twoSum(nums, target);
        if (indices.length == 2) {
            System.out.println("The indices are " + indices[0] + " and " + indices[1]);
        } else {
            System.out.println("No two numbers add up to the target value.");
        }
    }
    public int[] twoSum(int[] eoa, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < eoa.length; i++) {
            int complement = target - eoa[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(eoa[i], i);
        }
        return new int[] {};
    }
}
