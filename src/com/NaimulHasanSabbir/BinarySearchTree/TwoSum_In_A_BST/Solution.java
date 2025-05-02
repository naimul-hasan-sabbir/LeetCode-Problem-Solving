package com.NaimulHasanSabbir.BinarySearchTree.TwoSum_In_A_BST;

/*
Time Complexity: O(n^2)
Space Complexity:
 */

public class Solution {
    public boolean findTarget(TreeNode root, int k){
        return run(root, root, k);
    }
    public boolean run(TreeNode root, TreeNode currentNode, int k){
        if(currentNode == null) return false;
        if(find(root, k - currentNode.val, currentNode)) return true;

        return run(root, currentNode.left, k) || run(root, currentNode.right, k);

    }
    public boolean find(TreeNode root, int val, TreeNode current){
        if(root == null) return false;
        if(val > root.val) return find(root.right, val, current);
        else if (val < root.val) return find(root.left, val, current);
        else if (val == root.val) return root != current;

        else return false;
    }
}
