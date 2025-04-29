package com.NaimulHasanSabbir.BinarySearchTree.Construct_Binary_Search_Tree_From_Preorder_Traversal;

public class Solution {
    public static TreeNode bstFromPreorder(int[] preorder){
        return helper(preorder, Integer.MAX_VALUE, new int[]{0});
    }
    public static TreeNode helper(int[] preorder, int bound, int[] pointer){
        if(pointer[0] == preorder.length || preorder[pointer[0]] > bound){
            return null;
        }
        TreeNode node = new TreeNode(preorder[pointer[0]++]);
        node.left = helper(preorder, node.val, pointer);
        node.right = helper(preorder, bound, pointer);
        return node;
    }
    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        bstFromPreorder(preorder);
    }
}

