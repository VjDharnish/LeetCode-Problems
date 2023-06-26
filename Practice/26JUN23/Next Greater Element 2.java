// Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

// The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack =new Stack<>();
        int m =0;
        int lastInd = nums.length-1;
        while(m <lastInd && nums[m] <=nums[lastInd]) {
            m++;
        }
        if(m!=lastInd){
            stack.push(nums[m]);
        }

        for(int i =lastInd;i>=0;i--){
            int u =-1;
            while(!stack.isEmpty() && stack.peek()<=nums[i])
                stack.pop();
            if(!stack.isEmpty())
                u = stack.peek();
            else{
                for(int k=0;k<i;k++){
                    if(nums[k]>nums[i]){
                        u= nums[k];
                        break;
                    }
                }
            }
              stack.push(nums[i]);
            nums[i] = u;
          
        }
        return nums;
        
    }
}
