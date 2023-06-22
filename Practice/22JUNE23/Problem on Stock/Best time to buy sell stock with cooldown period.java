// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:

// After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
// Input: prices = [1,2,3,0,2]
// Output: 3
// Explanation: transactions = [buy, sell, cooldown, buy, sell]

  
class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return profit(prices,0,1,dp);
    }
    private int profit(int[] prices,int i,int buy,int[][] dp){
        if(i>=prices.length)
            return 0;
        if(dp[i][buy]!=-1)
            return dp[i][buy];
        int profit=0;
        if(buy==1)
            profit=Math.max(-prices[i]+profit(prices,i+1,0,dp),profit(prices,i+1,1,dp));
        else
            profit=Math.max(prices[i]+profit(prices,i+2,1,dp),profit(prices,i+1,0,dp));
        return dp[i][buy]=profit;
    }
}
