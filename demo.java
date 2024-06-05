//Program to write linear search in array
// public class demo {

//     public static String linearSearch(String arr[], String key)
//     {
//         int i;
//         for(i=0; i<arr.length; i++)
//         {
//             if(arr[i] == key){
//                 return arr[i];
//             }
//         }
//         return "false";
//     }
//     public static void main(String args[])
//     {
//         String menu[] = {"dosa", "sambhar", "chutney", "idli", "meduwada"};
//         String key = "Dhinka";
//         String result = linearSearch(menu, key);
        
//         if(result == key)
//         {
//             System.out.println(key + " Found");
//         }
//         else
//         {
//             System.out.println("Not Found");
//         }
//     }
// }




// Program to write largest number in an array

// public class demo
// {
//     public static int isLargest(int arr[])
//     {
//         int largest=0;
//         for(int i=0; i<arr.length; i++)
//         {
//             for(int j=i+1; j<arr.length-1; j++)
//             {
//                 if(arr[i]< arr[j])
//                 {
//                     largest = arr[j];
//                 }
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {2,5,7,1,56,6};
//         int result = isLargest(arr);
//         System.out.println("The largest element in array is " + result);
//     }
// }

//                OR 

// public class demo
// {
//     public static int isLargest(int arr[])
//     {
//         int largest=0;
//         int smallest = Integer.MAX;
//         for(int i=0; i<arr.length; i++)
//         {
//             if(largest < arr[i])
//             {
//                 largest = arr[i];
//             }
//             if(smallest > arr[i])
//             {
//                 smallest = arr[i];
//             }
//         }
//        System.out.println("The smallest element of array is : " + smallest);
//         return largest;
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {2,5,7,1,56,6};
//         int result = isLargest(arr);
//         System.out.println("The largest element in array is " + result);
//     }
// }





// Program  to write binary search

// public class demo
// {
//     public static int binarySearch(int arr[], int key)
//     {
//         int start = 0;
//         int end = arr.length - 1;
//         while(start<=end)
//         {
//             int mid = (start+end)/2;

//             if(arr[mid] == key)
//             {
//                 return mid;
//             }
//             else if(arr[mid] < key)
//             {
//                 start = mid+1;
//             }
//             else
//             {
//                 end = mid-1;
//             }
//         }

//         return -1;
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {2,4,6,8,10,12,14};
//         System.out.print("Enter the key you want to find : ");
//         try (Scanner d = new Scanner(System.in)) {
//             int key = d.nextInt();
//             int result = binarySearch(arr, key);
//             System.out.println("The index for the key is : "+ result);
//         }
//     }
// }





// Program to write reversed array

// public class demo
// {
//     public static void arrReverse(int arr[])
//     {
//         int first = 0;
//         int last = arr.length-1;

//         while(first<last)
//         {
//             int temp = arr[last];
//             arr[last] = arr[first];
//             arr[first] = temp;

//             first++;
//             last--;
//         }
//     }

//     public static void main(String args[])
//     {
//         int arr[] = {2,1,3,5,67,8};
//         for(int i=0; i<arr.length; i++)
//         {
//             System.out.println(arr[i]);
//         }
//         arrReverse(arr);
//         System.out.println("The reversed array is : ");
//         for(int i=0; i<arr.length; i++)
//         {
//             System.out.println(arr[i]);
//         }
//     }
// }




//Program to write pairs of the element of the array 

// public class demo
// {

//     public static void printPairs(int arr[])
//     {
        
//         for(int i=0; i<arr.length; i++)
//         {
//             int current = arr[i];
//             for(int j=i+1; j<arr.length; j++)
//             {
//                 System.out.print("(" + current + "," + arr[j] + ")");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {2,4,6,8,10};
//         printPairs(arr);
//     }
// }





//Program to print all the sub-arrays of array

// public class demo
// {

    // public static void subArrays(int arr[])
    // {
    //     int ts=0;
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         for(int j=i; j<arr.length; j++)
    //         {
    //             for(int k=i; k<=j; k++)
    //             {
    //                 System.out.print(arr[k] + " ");
                    
    //             }
    //             System.out.println();
    //             ts++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total subarrays are : " + ts);
    // }
    // public static void main(String args[])
    // {
    //     int arr[] = {1,2,3,4,5,6};
    //     subArrays(arr);
    // }
// }





// Program to find the maximum sum of the sub array 

// public class demo
// {

    // public static void maxSubArrays(int arr[])
    // {
    //     int ts=0;
    //     int currentSum;
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         for(int j=i; j<arr.length; j++)
    //         {
    //             currentSum = 0;
    //             for(int k=i; k<=j; k++)
    //             {
    //                 currentSum += arr[k];
    //             }
    //             System.out.println(currentSum);
    //             if(maxSum < currentSum)
    //             {
    //                 maxSum = currentSum;
    //             }
    //             System.out.println();
    //             ts++; 
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total subarrays are : " + ts);
    //     System.out.println("Thus the maximum sum is : " + maxSum);
        
    // }
    // public static void main(String args[])
    // {
    //     int arr[] = {1,2,3,4,5,6};
    //     maxSubArrays(arr);
    // }
// }





//Program to find maximum sum of sub-array using prefix sum array
//Prefix sum array of {1,2,3,4,5,6} would be {1,3,6,10,15,21}

// public class demo
// {

    // public static void maxSubArrays(int arr[])
    // {
    //     int ts=0;
    //     int currentSum;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[arr.length];

    //     prefix[0] = arr[0];
    //     for(int i=1; i<prefix.length; i++)
    //     {
    //         prefix[i] = prefix[i-1] + arr[i];
    //     }
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         for(int j=i; j<arr.length; j++)
    //         {
    //             currentSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

    //             System.out.println(currentSum);
    //             if(maxSum < currentSum)
    //             {
    //                 maxSum = currentSum;
    //             }
    //             System.out.println();
    //             ts++; 
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total subarrays are : " + ts);
    //     System.out.println("Thus the maximum sum is : " + maxSum);
        
    // }
    // public static void main(String args[])
    // {
    //     int arr[] = {1,2,3,4,5,6};
    //     maxSubArrays(arr);
    // }
// }




//Program to write maximum sum of sub arrays using kadane algorithm

// public class demo
// {
//     public static void kadane(int arr[])
//     {
//         int maxSum = Integer.MIN_VALUE;
//         int currentSum = 0;
//         for(int i=0; i<arr.length; i++)
//         {
//             currentSum += arr[i];
//             if(currentSum < 0)
//             {
//                 currentSum = 0;
//             }

//             maxSum = Math.max(maxSum, currentSum);
//         }
//         System.out.println("THe maximum sum is : " + maxSum);
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kadane(arr);
//     }
// }






//Program to find minimum sum of the subarray

// public class demo
// {

//     public static void minSubArrays(int arr[])
//     {
//         int ts=0;
//         int currentSum;
//         int minSum = Integer.MAX_VALUE;
//         for(int i=0; i<arr.length; i++)
//         { 
//             for(int j=i; j<arr.length; j++)
//             {
//                 currentSum = 0;
//                 for(int k=i; k<=j; k++)
//                 {
//                     currentSum += arr[k];
//                 }
//                 System.out.println(currentSum);
//                 if(minSum > currentSum)
//                 {
//                     minSum = currentSum;
//                 }
//                 System.out.println();
//                 ts++; 
//             }
//             System.out.println();
//         }
//         System.out.println("Total subarrays are : " + ts);
//         System.out.println("Thus the minimum sum is : " + minSum);
        
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {1,2,3,4,5,6};
//         minSubArrays(arr);
//     }
// }





//Program to claculate trapped rainwater in between bars

// public class demo 
// {
//     public static int trappedWater(int arr[])
//     {
//         int n=arr.length;
//         //left-max boundary 
//         int leftMax[] = new int[n];
//         leftMax[0] = arr[0];
//         for(int i=1; i<n; i++)
//         {
//             leftMax[i] = Math.max(arr[i], leftMax[i-1]);
//         }

//         //right-max boundary
//         int rightMax[] = new int[n];
//         rightMax[n-1] = arr[n-1];
//         for(int i=n-2; i>=0; i--)
//         {
//             rightMax[i] = Math.max(arr[i], rightMax[i+1]);
//         }

//         int trappedWater =0;
//         for(int i=0; i<n; i++)
//         {
//             // water-level is min(left max boundary, and right max boujndary)
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             // trapped water = waterlevel - height of bar
//             trappedWater += waterLevel - arr[i];
//         }

//         return trappedWater;
//     }

//     public static void main(String args[])
//     {
//         int height[] = {4,2,0,6,3,2,5};
//         int area = trappedWater(height);

//         System.out.println("THe are of trapped water is : " + area);
//     }
// }





// Write a program to consider the best day to buy or sell stocks according to the prices array provided 

// public class demo 
// {
//     public static int buyAndSellStocks(int arr[])
//     {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i =0; i<arr.length; i++)
//         {
//             if(buyPrice < arr[i])
//             {
//                 int profit = arr[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//             else
//             {
//                 buyPrice = arr[i];
//             }
//         }
//         return maxProfit;
//     }

//     public static void main(String args[])
//     {
//         int prices[] = {7,1,3,5,4,6};
//         int profit = buyAndSellStocks(prices);

//         System.out.println("The maximum profit that can be earned through this is : " + profit);

//     }
// }