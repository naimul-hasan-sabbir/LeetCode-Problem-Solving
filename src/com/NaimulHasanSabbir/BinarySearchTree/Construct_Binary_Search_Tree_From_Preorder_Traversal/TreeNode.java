package com.NaimulHasanSabbir.BinarySearchTree.Construct_Binary_Search_Tree_From_Preorder_Traversal;

public class TreeNode {
    public int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int _val) {
        this.val = _val;
    }
    public TreeNode(int _val, TreeNode _left, TreeNode _right) {
        this.val = _val;
        this.left = _left;
        this.right = _right;
    }
}
