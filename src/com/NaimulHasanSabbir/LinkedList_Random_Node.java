package com.NaimulHasanSabbir;

public class ListNode{
    int val;
    ListNode next;
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val;this.next = next;}
}

public class LinkedList_Random_Node {
    int n = 0;
    ListNode head = null;
    public solution(ListNode head){
        this.head = head;
    }
    public int getRandom(){
        ListNode temp = this.head;
        int i = 1, res = 0;
        while(temp != null){
            if(Math.random() * i < 1){
                res = temp.val;
            }
            temp = temp.next;
            i++;
        }
        return res;
    }
}
