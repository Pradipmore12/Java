public class Kadanes {
    public static int maxSumSubarrKadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        int max=Integer.MIN_VALUE;
        int negCount=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<0){
                negCount++;
            }
            max=Math.max(arr[i],max);
        }
        System.out.println(negCount);
        if(negCount==arr.length){
            return max;
        }
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<0) {
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }

    public static void main(String args[]) {
        //int arr[] = { -2,-3,4,-1,-2,1,5,-3 };
        int arr[]={-1,-2,-3,-4};
        System.err.println(maxSumSubarrKadanes(arr)); 
    }

    
}
