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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<Integer> stack = new Stack<>();
        dfs(root, stack);
        return new ArrayList<>(stack);
    }
    public void dfs(TreeNode root, Stack<Integer> stack){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            stack.push(root.val);
            return;
        }
        dfs(root.left, stack);
        dfs(root.right, stack);
        stack.push(root.val);
    }
}