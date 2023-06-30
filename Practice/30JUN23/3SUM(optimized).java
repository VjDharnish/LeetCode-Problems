class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int  i=0;i<nums.length-2;i++){
           
            int needed = 0-nums[i];
             int l = i+1;
             int r= nums.length-1;
              //System.out.println(needed);
             while(l<r){
                 int sum = nums[l]+nums[r];
                 //  System.out.println("sum="+sum);
                 if(sum==needed){
                     List<Integer> list =Arrays.asList(nums[i],nums[l],nums[r]);
                     result.add(new ArrayList<>(list));
                     l++;
                     r--;
                     while(l<r && nums[l]==nums[l-1])l++;
                     while(r>l && nums[r]==nums[r+1] )r--;
                     
                 }
                 else if(sum<needed){
                     l++;
                 }
                 else{
                     r--;
                 }
             }
             while(i<nums.length-1 && nums[i]==nums[i+1]){
                 i++;
             }

        }
        //System.out.println(map);
        return result;
      
    }
}
