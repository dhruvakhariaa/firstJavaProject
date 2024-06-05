package Arrays;

public class SubArrays {
    public static void subArrays(int arr[])
    {
        int ts=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                for(int k=i; k<=j; k++)
                {
                    System.out.print(arr[k] + " ");
                    
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : " + ts);
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        subArrays(arr);
    }
}
