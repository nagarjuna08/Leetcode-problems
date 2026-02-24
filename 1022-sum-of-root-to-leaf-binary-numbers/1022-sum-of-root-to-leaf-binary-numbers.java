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
        static int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        sum=0;
        findleaf(root,new StringBuilder());
        return sum;
    }
    public void findleaf(TreeNode root, StringBuilder str)
    {
        if (root == null) return;
        str.append(root.val);
        if(root.left == null && root.right == null)
        {
            String binaryNumber = str.toString();
            int decimalInt = Integer.parseInt(binaryNumber, 2);
            System.out.println(decimalInt);
            sum+=decimalInt;
            //return;
        }
        else {
            findleaf(root.left, str);
            findleaf(root.right, str);
        }
        str.deleteCharAt(str.length() - 1);
    }
}