// You are given a 0-indexed integer array costs where costs[i] is the cost of hiring the ith worker.

// You are also given two integers k and candidates. We want to hire exactly k workers according to the following rules:

// You will run k sessions and hire exactly one worker in each session.
// In each hiring session, choose the worker with the lowest cost from either the first candidates workers or the last candidates workers. Break the tie by the smallest index.
// For example, if costs = [3,2,7,7,1,2] and candidates = 2, then in the first hiring session, we will choose the 4th worker because they have the lowest cost [3,2,7,7,1,2].
// In the second hiring session, we will choose 1st worker because they have the same lowest cost as 4th worker but they have the smallest index [3,2,7,7,2]. Please note that the indexing may be changed in the process.
// If there are fewer than candidates workers remaining, choose the worker with the lowest cost among them. Break the tie by the smallest index.
// A worker can only be chosen once.
// Return the total cost to hire exactly k workers.



class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long cost =0;
         Queue<Integer> q1 = new PriorityQueue<>();
          Queue<Integer> q2 = new PriorityQueue<>();
          int m  = 0;
          while(q1.size()!=candidates){
              q1.add(costs[m]);
              m++;
          }
          int n =costs.length-1;
          while(q2.size()!=candidates && n>=m){    
          q2.add(costs[n]);
          n--;      
          }
        while(k!=0){
         
          int small=0;
          
          if(q2.isEmpty()|| !q1.isEmpty() && q1.peek()<=q2.peek()){
              small =q1.poll();
              if(m<=n)
              q1.add(costs[m++]);
          }
          else if(!q2.isEmpty()){
               small =q2.poll();
             if(n>=m)
              q2.add(costs[n--]);
          }
          k--;
        //  System.out.println(small);
          cost+=small;
          
        }
        return cost;
    }
}
