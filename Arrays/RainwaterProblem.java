package Arrays;
//Program to claculate trapped rainwater in between bars

public class RainwaterProblem {
    public static int trappedWater(int arr[])
    {
        int n=arr.length;
        //left-max boundary 
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++)
        {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        //right-max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--)
        {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trappedWater =0;
        for(int i=0; i<n; i++)
        {
            // water-level is min(left max boundary, and right max boujndary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height of bar
            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;
    }

    public static void main(String args[])
    {
        int height[] = {4,2,0,6,3,2,5};
        int area = trappedWater(height);

        System.out.println("THe are of trapped water is : " + area);
    }
}
