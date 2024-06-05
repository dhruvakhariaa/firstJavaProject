package Arrays;

public class ReversedArray {
    public static void arrReverse(int arr[])
    {
        int first = 0;
        int last = arr.length-1;

        while(first<last)
        {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[])
    {
        int arr[] = {2,1,3,5,67,8};
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        arrReverse(arr);
        System.out.println("The reversed array is : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
