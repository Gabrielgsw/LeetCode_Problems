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

//Link: https://leetcode.com/problems/binary-tree-inorder-traversal/?envType=problem-list-v2&envId=stack
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode aux = root;   
        while(!s.isEmpty() || aux != null){
            if(aux != null){
                s.push(aux);
                aux=aux.left;
            }else{
                aux = s.pop();
                list.add(aux.val);
                aux=aux.right;
            }
        }
        return list;
    }
    
}
