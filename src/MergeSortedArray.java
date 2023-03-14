import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 0, 0, 0};
        int[] n2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(n1, m, n2, n);
        System.out.println("Merged Array: ");
        for (int i = 0; i < n1.length; i++) {
            System.out.print(n1[i] + " ");
        }
    }
    public static void merge(int[] n1, int m, int[] n2, int n) {
        int i=m-1; // will point at m-1 index of n1 array
        int j=n-1; // will point at n-1 index of n2 array
        int k=n1.length-1; //will point at the last position of the n1 array

        while(j>=0){
            if(i>=0 && n1[i]>n2[j]){
                n1[k]=n1[i];
                k--;
                i--; //updating pointer for further comparisons
            }else{
                n1[k] = n2[j];
                k--;
                j--; //updating pointer for further comparisons
            }
        }
    }
}
