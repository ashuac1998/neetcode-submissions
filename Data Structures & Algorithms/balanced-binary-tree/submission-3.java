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
    public boolean isBalanced(TreeNode root) {
        boolean[] balanced = {true};
        checkBalance(root, balanced);
        return balanced[0];
    }
    public int checkBalance(TreeNode node, boolean[] balanced){
        if(node == null){
            return 0;
        }
        int left = checkBalance(node.left, balanced);
        int right = checkBalance(node.right, balanced);
        balanced[0] = balanced[0] & Math.abs(left - right) <= 1;
        return Math.max(left+1, right+1);
    }
}
