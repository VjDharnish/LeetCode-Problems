
// You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list where edges[i] = [a, b] is an undirected edge connecting the nodes a and b with a probability of success of traversing that edge succProb[i].

// Given two nodes start and end, find the path with the maximum probability of success to go from start to end and return its success probability.

// If there is no path from start to end, return 0. Your answer will be accepted if it differs from the correct answer by at most 1e-5.
// TLE before Dp wrong Answwer after dp
  class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        boolean[] visited = new boolean[edges.length];
        double[] dp = new double[n];
        
            Arrays.fill(dp,-1.0);
            return prob(edges,succProb,start,end,1.0,visited,dp);
    }
    private double prob(int[][] edges,double[] succProb,int start,int end,double prob,boolean[] visited,double[] dp){
        if(start == end){
            return prob;
        }
        if(dp[start]!=-1.0)
            return dp[start];
        double max =0.0;
    
        for(int i =0;i<edges.length;i++){
            if(!visited[i]&& edges[i][0]==start){
                visited[i] =true;
                max=Math.max(max,prob(edges,succProb,edges[i][1],end,prob*succProb[i],visited,dp));
                visited[i] =false;
            }
            else if(!visited[i] && edges[i][1]==start){
                visited[i] = true; 
                 max=Math.max(max,prob(edges,succProb,edges[i][0],end,prob*succProb[i],visited,dp));
                  visited[i] =false;
            }
        }
        return dp[start]=max;

    }
}
