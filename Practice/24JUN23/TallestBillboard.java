// You are installing a billboard and want it to have the largest height. The billboard will have two steel supports, one on each side. Each steel support must be an equal height.

// You are given a collection of rods that can be welded together. For example, if you have rods of lengths 1, 2, and 3, you can weld them together to make a support of length 6.

// Return the largest possible height of your billboard installation. If you cannot support the billboard, return 0.

 

// Example 1:

// Input: rods = [1,2,3,6]
// Output: 6
// Explanation: We have two disjoint subsets {1,2,3} and {6}, which have the same sum = 6.

class Solution {
    int max =0;
    public int tallestBillboard(int[] rods) {
     
      int sum =0;
      for(int i:rods)
        sum+=i;
      
      compute(rods,rods.length-1,0,0,sum);
      return max;
    }
    private void compute(int[] rods,int i,int left,int right,int remain){
        if(i<0){
            if(left==right && max<left)
                max=left;
            return;
        }
        if(Math.abs(left-right)>remain || left+right+remain<=2*max)  // for remaining <needed to match no use of it && already maximest found
            return;
        compute(rods,i-1,left+rods[i],right,remain-rods[i]);
        compute(rods,i-1,left,right+rods[i],remain-rods[i]);
        compute(rods,i-1,left,right,remain-rods[i]);
    }
}
