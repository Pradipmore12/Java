import java.util.*;

public class reverseArray {
    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1, temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };

        // optimized method see the function above
        reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Iterative Method
        int arr1[] = new int[arr.length];
        int start = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            arr1[start] = arr[j];
            start++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }

}
