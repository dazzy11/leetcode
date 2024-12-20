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
    public TreeNode reverseOddLevels(TreeNode root) {
        recur(root.left,root.right,0);
        return root;
    }
    public void recur(TreeNode node1,TreeNode node2,int level){
        if(node1==null||node2==null)
            return;
        if(level%2==0){
            int temp=node1.val;
            node1.val=node2.val;
            node2.val=temp;
        }
        recur(node1.left,node2.right,level+1);
        recur(node2.left,node1.right,level+1);
    }
}