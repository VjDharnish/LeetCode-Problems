// You are given an array of distinct positive integers locations where locations[i] represents the position of city i. You are also given integers start, finish and fuel representing the starting city, ending city, and the initial amount of fuel you have, respectively.
// At each step, if you are at city i, you can pick any city j such that j != i and 0 <= j < locations.length and move to city j. Moving from city i to city j reduces the amount of fuel you have by |locations[i] - locations[j]|. Please notice that |x| denotes the absolute value of x.
// Notice that fuel cannot become negative at any point in time, and that you are allowed to visit any city more than once (including start and finish).
// Return the count of all possible routes from start to finish. Since the answer may be too large, return it modulo 109 + 7
// Example 1:

// Input: locations = [2,3,6,8,4], start = 1, finish = 3, fuel = 5
// Output: 4
// Explanation: The following are all possible routes, each uses 5 units of fuel:
// 1 -> 3
// 1 -> 2 -> 3
// 1 -> 4 -> 3
// 1 -> 4 -> 2 -> 3
// Example 2:

// Input: locations = [4,3,1], start = 1, finish = 0, fuel = 6
// Output: 5
// Explanation: The following are all possible routes:
// 1 -> 0, used fuel = 1
// 1 -> 2 -> 0, used fuel = 5
// 1 -> 2 -> 1 -> 0, used fuel = 5
// 1 -> 0 -> 1 -> 0, used fuel = 3
// 1 -> 0 -> 1 -> 0 -> 1 -> 0, used fuel = 5
class Solution {
    int MOD=1000000007;
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int[][] dp =new int[locations.length][fuel+1];
        for(int[] a:dp)
            Arrays.fill(a,-1);
        return  findPath(locations,start,finish,fuel,dp);
        
    }
    private int findPath(int[] locations,int start,int finish,int fuel,int[][] dp){
        
        if(fuel <0)
            return 0;
         if(dp[start][fuel]!=-1){
             return dp[start][fuel];
             
         }

         int curr =(start==finish)?1:0;
       
        // left
        
        for(int  m =0;m<locations.length;m++){
            if(m!=start)
           curr=( curr+findPath(locations,m,finish,fuel-Math.abs(locations[m]-locations[start]),dp))%MOD;
        }
        return dp[start][fuel]=curr;
    }
}
