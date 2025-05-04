package com.NaimulHasanSabbir.LinkedList.Flatten_Binary_Tree_to_Linked_List;

import com.sun.source.tree.Tree;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int _val){
        this.val = _val;
    }
    public TreeNode(int _val, TreeNode _left, TreeNode _right){
        this.val = _val;
        this.left = _left;
        this.right = _right;
    }
}
