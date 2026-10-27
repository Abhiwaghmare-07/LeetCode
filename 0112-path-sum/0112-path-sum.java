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
    public boolean pathSum(TreeNode root,int sum,int value){
        if(root==null) return false;
        value+=root.val;
        if(root.right==null && root.left==null) return value==sum;
        return pathSum(root.left,sum,value) ||   pathSum(root.right,sum,value);
    

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root,targetSum,0);
    }
}