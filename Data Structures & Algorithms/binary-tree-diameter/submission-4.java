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
        int[] dia = new int[1];
        findDia(root, dia);
        return dia[0];
    }
    public int findDia(TreeNode node, int[] dia){
        if(node == null){
            return 0;
        }
        int left = findDia(node.left, dia);
        int right = findDia(node.right, dia);
        dia[0] = Math.max(dia[0], left+right);
        return Math.max(left+1, right+1);
    }
}
