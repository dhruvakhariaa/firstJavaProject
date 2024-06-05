package Arrays;
//Program to find maximum sum of sub-array using prefix sum array
//Prefix sum array of {1,2,3,4,5,6} would be {1,3,6,10,15,21}

public class MaxSumPrefixArray {
    public static void maxSubArrays(int arr[])
    {
        int ts=0;
        int currentSum;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                currentSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                System.out.println(currentSum);
                if(maxSum < currentSum)
                {
                    maxSum = currentSum;
                }
                System.out.println();
                ts++; 
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : " + ts);
        System.out.println("Thus the maximum sum is : " + maxSum);
        
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        maxSubArrays(arr);
    }
}
