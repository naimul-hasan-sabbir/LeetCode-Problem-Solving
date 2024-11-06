package com.NaimulHasanSabbir.LinkedListAndArrays.problem1.Optimal_Solution;

public class RotateALinkedList {
    static ListNode insertNode(ListNode head,int val) {
        ListNode newNode = new ListNode(val);
        if(head == null) {
            head = newNode;
            return head;
        }
        ListNode temp = head;
        while(temp.next != null) temp = temp.next;

        temp.next = newNode;
        return head;
    }
    static ListNode rotateRight(ListNode head, int k){
        if(head == null || head.next == null || k == 0) return head;

        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            length++;
            temp = temp.next;
        }
        temp.next = head;
        k = k % length;
        int end = length - k;
        while(end-- != 0){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
    static void printList(ListNode head) {
        while(head.next != null) {
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println(head.val);

    }
    public static void main(String[] args) {
        ListNode head = null;
        head = insertNode(head,1);
        head = insertNode(head,2);
        head = insertNode(head,3);
        head = insertNode(head,4);
        head = insertNode(head,5);

        System.out.println("Original List: ");
        printList(head);
        int k = 6;
        ListNode newHead = rotateRight(head, k);
        System.out.println("After "+k+" rotation: ");
        printList(newHead);
    }
}
