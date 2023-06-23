class Solution {
    public int lengthOfLIS(int[] nums) {
       List<Integer> res = new ArrayList<>();
       int i =0;
       while(i<nums.length){
           if(res.isEmpty() || res.get(res.size()-1) <nums[i]){
               res.add(nums[i]);
           }
           else{
               int idx =binarySearch(nums[i],res);
               res.set(idx,nums[i]); 
           }
           i++;
       }
       return res.size();
        
    }
    private int binarySearch(int target,List<Integer> res){
        int left =0;
        int right = res.size()-1;
        while(left<=right){
            int mid = (left+right)/2; 
            if(target>=res.get(mid)){
                 left=mid+1;
            }
            else 
                right =mid-1;
            
            
               
        } 
        return res.get(Math.max(right,0))==target?right:left;
    } 
}
