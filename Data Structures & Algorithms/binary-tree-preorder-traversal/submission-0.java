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
    public List<Integer> preorderTraversal(TreeNode root) {
        Queue<Integer> queue = new LinkedList<>();
        bfs(root, queue);
        return new ArrayList<Integer>(queue);
    }
    public void bfs(TreeNode root, Queue<Integer> queue){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            queue.add(root.val);
            return;
        }
        queue.add(root.val);
        bfs(root.left, queue);
        bfs(root.right, queue);
    }
}