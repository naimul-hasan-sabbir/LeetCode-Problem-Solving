package com.NaimulHasanSabbir.LinkedListAndArrays.problem1.Brute_Force_Solution;

public class RotateALinkedList {
    static Node insertNode(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public static Node rotateRight(Node head, int k) {
        if(head == null || head.next == null) return head;

        for(int i = 0; i < k; i++){
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            Node end = temp.next;
            temp.next = null;
            end.next = head;
            head = end;
        }
        return head;
    }
    static void printList(Node head) {
        while (head.next != null) {
            System.out.print(head.num + "->");
            head = head.next;
        }
        System.out.println(head.num);

    }
    public static void main(String args[]) {
        Node head = null;
        //inserting Node
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 3);
        head = insertNode(head, 4);
        head = insertNode(head, 5);

        System.out.println("Original list: ");
        printList(head);

        int k = 2;
        Node newHead = rotateRight(head, k);

        System.out.println("After " + k + " iterations: ");
        printList(newHead); //list after rotating nodes

    }
}
