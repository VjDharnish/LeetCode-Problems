/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void equalPathSum(TreeNode root,int targetSum,List<Integer> arr,List<List<Integer>> result){
        if(root == null) return;
         arr.add(root.val);
        if(root.left== null && root.right == null){
            if(targetSum == root.val){           
                result.add(new ArrayList(arr));
                // arr.remove(arr.size()-1);
            }    
            return;
        }
    if(root.left!=null){
    equalPathSum(root.left,targetSum-root.val,arr,result);
    arr.remove(arr.size()-1);
    }

    if(root.right!=null){
    equalPathSum(root.right,targetSum-root.val,arr,result);
    arr.remove(arr.size()-1);
    }

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        List<Integer> arr = new ArrayList<>();
        equalPathSum(root,targetSum,arr,result);
        return result;
    }
}
