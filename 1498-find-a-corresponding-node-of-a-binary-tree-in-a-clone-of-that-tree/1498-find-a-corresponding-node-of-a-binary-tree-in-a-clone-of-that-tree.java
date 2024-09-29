/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        int tar=target.val;
        return pre(tar, cloned);
    }
    public TreeNode pre(int tar,TreeNode root){
        if (root == null) return null;
        if(root.val==tar){
            return root;
        }
       TreeNode leftResult = pre(tar, root.left);
    if (leftResult != null) return leftResult;

    return pre(tar, root.right);

    }
}