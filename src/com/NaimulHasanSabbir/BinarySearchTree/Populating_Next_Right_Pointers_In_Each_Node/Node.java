package com.NaimulHasanSabbir.BinarySearchTree.Populating_Next_Right_Pointers_In_Each_Node;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
    public Node(int _val){
        this.val = _val;
    }
    public Node(int _val, Node _left, Node _right, Node _next){
        this.val = _val;
        this.left = _left;
        this.right = _right;
        this.next = _next;
    }
}
