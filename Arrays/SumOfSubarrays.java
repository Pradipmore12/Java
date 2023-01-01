//Sum of possible subarrays
import java.util.*;

public class SumOfSubarrays {
    public static void printSumOfSubarr(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.println("sum is :" + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("maxSum  is :" + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        printSumOfSubarr(arr);
    }

}
