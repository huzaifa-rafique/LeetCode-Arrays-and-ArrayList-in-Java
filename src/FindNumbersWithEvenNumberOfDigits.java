public class FindNumbersWithEvenNumberOfDigits {
    public static void main (String[] args){
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            int digits = 0;
            while(number != 0){
                number = number / 10;
                digits++;
            }
            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
