package Arrays;
//Program to find the maximum sum of the sub array

public class MaxSubArrays {
    public static void maxSubArrays(int arr[])
    {
        int ts=0;
        int currentSum;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                currentSum = 0;
                for(int k=i; k<=j; k++)
                {
                    currentSum += arr[k];
                }
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
