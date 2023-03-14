import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = plusOne(digits);
        System.out.println("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        //This code is executed only if the for loop in the plusOne method finishes without returning a value. This means that all the digits in the input array are 9.
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
