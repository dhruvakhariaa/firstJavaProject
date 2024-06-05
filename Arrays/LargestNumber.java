package Arrays;
public class LargestNumber {
    public static int isLargest(int arr[])
    {
        int largest=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length-1; j++)
            {
                if(arr[i]< arr[j])
                {
                    largest = arr[j];
                }
            }
        }
        return largest;
    }
    public static void main(String args[])
    {
        int arr[] = {2,5,7,1,56,6};
        int result = isLargest(arr);
        System.out.println("The largest element in array is " + result);
    }
}
