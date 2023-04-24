// You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. Note that we have only one quantity of each item.
// In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[]
// such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item or dont pick it (0-1 property).


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
        return combination(0,W,wt,val,n,new int[n+1][W+1]);
    } 
    private static int combination(int idx,int W,int[] wt,int[] val,int n,int[][]dp){
        if(idx == n){
            return 0;
        }
        if(dp[idx][W]!=0) return dp[idx][W];
        int a=0,b=0;
        if(wt[idx]<=W){
            a= val[idx]+combination(idx+1,W-wt[idx],wt,val,n,dp);
        }
        b=combination(idx+1,W,wt,val,n,dp);
        return dp[idx][W]= Math.max(a,b);
        
    }
}
