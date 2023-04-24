// Given a string s, find the longest palindromic subsequence's length in s.

// A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.


class Solution {
    public int longestPalindromeSubseq(String s) {
      int len = s.length();
      int[][]dp = new int[len+1][len+1];
      for(int i=1;i<=len;i++){
          for(int j =1;j<=len;j++){
              dp[i][j]=(s.charAt(i-1)==s.charAt(len-j))?dp[i-1][j-1]+1:Math.max(dp[i-1][j],dp[i][j-1]);
          }
      }
      return dp[len][len];

    }
}
