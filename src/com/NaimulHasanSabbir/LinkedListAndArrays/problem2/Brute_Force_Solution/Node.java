package com.NaimulHasanSabbir.LinkedListAndArrays.problem2.Brute_Force_Solution;

public class Node {
    int data;
    Node next;
    Node random;
    Node(){
        this.data = 0;
        this.next = null;
        this.random = null;
    }
    Node(int x){
        this.data = x;
        this.next = null;
        this.random = null;
    }
    Node(int x, Node nextNode, Node randomNode){
        this.data = x;
        this.next = nextNode;
        this.random = randomNode;
    }
}
