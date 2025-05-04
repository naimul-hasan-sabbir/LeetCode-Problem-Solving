package com.NaimulHasanSabbir.BinarySearchTree.Binary_Search_Tree_Iterator;

import java.util.Stack;

public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root){
        pushAll(root);
    }
    public boolean hasNext(){
        return !stack.isEmpty();
    }
    public int next(){
        TreeNode node = stack.pop();
        pushAll(node.right);
        return node.val;
    }
    public void pushAll(TreeNode currentNode){
        for(; currentNode != null; stack.push(currentNode), currentNode = currentNode.left);
    }
}
