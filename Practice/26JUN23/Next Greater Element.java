class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n =nums2.length;
        int max = nums2[n-1];
        HashMap<Integer,Integer> map =new HashMap<>();
        Stack<Integer> stack =new Stack<>();
        for(int i = n-1;i>=0;i--){
            int u =-1;
            while(!stack.isEmpty() && stack.peek() <nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                u =-1;
            }else
                u = stack.peek();
            map.put(nums2[i],u);
            stack.push(nums2[i]);
        }
        for(int i =0;i<nums1.length;i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}
