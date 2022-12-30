import java.util.*;
public class LargeInarray {
    public static int getLarge(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
                largest=Math.max(largest,arr[i]);
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements one by one");
        //taking input

        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest element is " + getLarge(arr));
    }
}
