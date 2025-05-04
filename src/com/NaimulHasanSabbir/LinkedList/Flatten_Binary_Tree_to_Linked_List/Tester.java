package com.NaimulHasanSabbir.LinkedList.Flatten_Binary_Tree_to_Linked_List;

public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Solution t = new Solution();
        t.flatten(root);
    }
}
