import java.util.*;

public class BinSearch {
    public static int binSearch(int arr[], int key) {
        int s = 0;
        int e = arr.length - 1;
        int mid;
        while (s <= e) {
            mid = (s + e) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                e--;
            } else {
                s++;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 4;

        if (binSearch(arr, key) == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at index " + binSearch(arr, key));

        }
    }

}
