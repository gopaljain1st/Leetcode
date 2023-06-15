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
    int currentSum;
    public int maxLevelSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        int height = height(root);
        int maxSum = root.val;
        int maxLevel = 1;
        for(int i=1;i<=height;i++){
            currentSum = 0;
            computeMaxSumLevel(root, i);
            if(currentSum > maxSum) {
                maxSum = currentSum;
                maxLevel = i;
            }
        }
        return maxLevel;    
    }
    
    public void computeMaxSumLevel(TreeNode root, int level){
        if(root==null){
            return;
        }
        if(level == 1){
            currentSum+=root.val;
        } else if (level > 1){
            computeMaxSumLevel(root.left, level-1);
            computeMaxSumLevel(root.right, level-1);
        }
    }
    
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        if(leftHeight > rightHeight){
            return leftHeight + 1;
        } else{
            return rightHeight + 1;
        }
    }
}