package com.NaimulHasanSabbir.BinarySearchTree.Populating_Next_Right_Pointers_In_Each_Node;

import com.NaimulHasanSabbir.BinarySearchTree.Populating_Next_Right_Pointers_In_Each_Node.Node;

import java.util.*;

public class Solution {
    public static Node connect(Node root) {
        if(root == null){
            return null;
        }
        connetTwoNodes(root.left, root.right);
        return root;
    }
    public static void connetTwoNodes(Node root1, Node root2){
        if(root1 == null || root2 == null){
            return;
        }
        root1.next = root2;
        connetTwoNodes(root1.left, root1.right);
        connetTwoNodes(root2.left, root2.right);

        connetTwoNodes(root1.right, root2.left);
    }
    public static void printTreeWithNext(Node root){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        Node levelStart = root;
        while(levelStart != null){
            Node current = levelStart;
            List<String> levelNodes = new ArrayList<String>();
            while(current != null){
                levelNodes.add(String.valueOf(current.val));
                current = current.next;
            }
            System.out.println(String.join(" -> ", levelNodes) + "-> Null");
            levelStart = levelStart.left;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        connect(root);

        printTreeWithNext(root);
    }
}
