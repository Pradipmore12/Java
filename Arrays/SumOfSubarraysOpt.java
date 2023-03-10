public class SumOfSubarraysOpt {
    public static void printSumOfSubarr(int arr[]) {

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                //sum = prefix[end]-prefic[start-1]  if start==0 then = prefix[end]
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

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
