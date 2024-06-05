package Arrays;
// Write a program to consider the best day to buy or sell stocks according to the prices array provided 

public class Stocks {
    public static int buyAndSellStocks(int arr[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0; i<arr.length; i++)
        {
            if(buyPrice < arr[i])
            {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else
            {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[])
    {
        int prices[] = {7,1,3,5,4,6};
        int profit = buyAndSellStocks(prices);

        System.out.println("The maximum profit that can be earned through this is : " + profit);

    }
}
