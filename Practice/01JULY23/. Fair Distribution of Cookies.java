// You are given an integer array cookies, where cookies[i] denotes the number of cookies in the ith bag. You are also given an integer k that denotes the number of children to distribute all the bags of cookies to. All the cookies in the same bag must go to the same child and cannot be split up.

// The unfairness of a distribution is defined as the maximum total cookies obtained by a single child in the distribution.

// Return the minimum unfairness of all distributions.

// Input: cookies = [8,15,10,20,8], k = 2
// Output: 31
// Explanation: One optimal distribution is [8,15,8] and [10,20]
// - The 1st child receives [8,15,8] which has a total of 8 + 15 + 8 = 31 cookies.
// - The 2nd child receives [10,20] which has a total of 10 + 20 = 30 cookies.
// The unfairness of the distribution is max(31,30) = 31.
// It can be shown that there is no distribution with an unfairness less than 31.
class Solution {
    public int distributeCookies(int[] cookies, int k) {
        int[] children =new int[k];
        return unfairness(cookies,0,children,k);
    }
    private int unfairness(int[] cookies,int i,int[] children,int k){
        if(i==cookies.length){
            int max= 0;
            for(int a:children){
                max=Math.max(max,a);
            }
            return max;
        }
        int unfair = Integer.MAX_VALUE;
        for(int j=0;j<k;j++){
            children[j]+=cookies[i];
            unfair =Math.min(unfair,unfairness(cookies,i+1,children,k));
            children[j]-=cookies[i];
        }
        return unfairness;

    }
}
