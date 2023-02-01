class Solution {
    public int Count(int[] nums,int target,int[] memory){
        int count=0;
         if(target<0) 
            return 0;
         if(target ==0)
            return 1;
         if(memory[target]!=-1)
            return memory[target];
        
        for( int i=0;i<nums.length;i++){
      
            count+= Count(nums,target-nums[i],memory);
          //  target+=nums[i];
      
        }
        memory[target] = count;

          //count+= combinationSum4(nums,target);
        return memory[target];

    }
public int combinationSum4(int[] nums, int target) {
        int[] memory = new int[target+1];
        Arrays.fill(memory,-1);
        int count = Count(nums,target,memory);
        return count;
    }
}
