// You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.

// Find the maximum profit you can achieve. You may complete at most k transactions: i.e. you may buy at most k times and sell at most k times.

// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

//  Input: k = 2, prices = [2,4,1]
// Output: 2
// Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.

class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][][]dp =new int[prices.length][2][k+1];
        for(int[][] e:dp){
            for(int  a[]:e){
                Arrays.fill(a,-1);
            }
        }
        return profit(prices,0,1,k,dp);
    }
    private int profit(int[] prices,int i,int buy,int k,int[][][] dp){
        if(k==0||i == prices.length)
            return 0;
        if(dp[i][buy][k]!=-1)
            return dp[i][buy][k];
        int profit=0;
        if(buy==1)
            profit= Math.max(-prices[i]+profit(prices,i+1,0,k,dp),profit(prices,i+1,1,k,dp));
        else
            profit= Math.max(prices[i]+profit(prices,i+1,1,k-1,dp),profit(prices,i+1,0,k,dp));
        return dp[i][buy][k]=profit;

    }
}
