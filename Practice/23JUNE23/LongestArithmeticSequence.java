// Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.

// Note that:

// A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
// A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).
 

// Example 1:

// Input: nums = [3,6,9,12]
// Output: 4
// Explanation:  The whole array is an arithmetic sequence with steps of length = 3.

// TLE/.......
class Solution {
    public int longestArithSeqLength(int[] nums) {
        
        return subseq(nums,0,new ArrayList<Integer>());
        
    }
    private int subseq(int[] nums,int i,ArrayList<Integer> arr){
        if(i==nums.length){
            if(arr.size()<3)
                return 0;
            int k=1;
            int commonDiff = arr.get(k)-arr.get(k-1);
            while(k<arr.size() && commonDiff==arr.get(k)-arr.get(k-1)){
                k++;
            }
            return k;
        }
        int count =0;
        arr.add(nums[i]);
        count = subseq(nums,i+1,arr);
        arr.remove(arr.size()-1);
        count =Math.max(count,subseq(nums,i+1,arr));
        return count;
    }
}
