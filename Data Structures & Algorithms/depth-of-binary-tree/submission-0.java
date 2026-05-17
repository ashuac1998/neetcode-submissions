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
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        return depth(root, maxDepth, 1);
    }
    public int depth(TreeNode node, int maxDepth, int depth){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return Math.max(maxDepth, depth);
        }
        return Math.max(depth(node.left, maxDepth, depth+1), depth(node.right, maxDepth, depth+1));
    }
}
