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
    int hei=0;
    public int maxDepth(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        depth(root,0);
        return hei;
    }
    public void depth(TreeNode root,int len)
    {
        if(root==null)
        {
            hei=Math.max(len,hei);
            return;
        }
        depth(root.left,len+1);
        depth(root.right,len+1);
    }
}