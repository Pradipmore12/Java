import java.util.*;
//Linear Search
public class LinearSearch {
    public static int linSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the key to find");
        int key = sc.nextInt();
        if (linSearch(nums, key) == -1) {
            System.out.println(key + " is not present");
        } else {
            System.out.println(key + " is found at index :" + linSearch(nums, key));

        }

    }

}
