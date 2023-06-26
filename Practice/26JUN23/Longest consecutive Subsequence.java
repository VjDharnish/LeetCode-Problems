class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <=1)
            return nums.length;
        Arrays.sort(nums);
        int maxLen = 1;
        int k = nums[0]+1;
        int start = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                start++;
                continue;
            }
                
            if(nums[i] ==k ){
                k++;
            }
            else{
                maxLen = Math.max(maxLen,i-start);
                start=i;
                k= nums[i]+1;
            }
        }

        maxLen=Math.max(maxLen,nums.length-start);
        return maxLen;
    }
}
