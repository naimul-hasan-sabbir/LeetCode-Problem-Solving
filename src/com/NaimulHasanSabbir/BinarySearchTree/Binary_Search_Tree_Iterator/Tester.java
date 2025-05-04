package com.NaimulHasanSabbir.BinarySearchTree.Binary_Search_Tree_Iterator;

import com.NaimulHasanSabbir.BinarySearchTree.Binary_Search_Tree_Iterator.TreeNode;

public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);
        BSTIterator t = new BSTIterator(root);

        // Example of working of the code
        System.out.println(t.next());
    }
}
