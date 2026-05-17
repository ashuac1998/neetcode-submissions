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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        findDia(root, res);
        return res[0];
    }
    public int findDia(TreeNode node, int[] res){
        if(node == null){
            return 0;
        }
        int l = findDia(node.left, res);
        int r = findDia(node.right, res);
        res[0] = Math.max(res[0], l+r);
        return 1 + Math.max(l, r);

    }
}
