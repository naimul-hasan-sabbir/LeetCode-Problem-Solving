package com.NaimulHasanSabbir;

import java.util.List;

public class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}
public class reverse_linked_list_2 {
    public ListNode reverseBetween(ListNode head, int left, int right){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 0; i < left - 1; i++){
            prev = prev.next;
        }
        ListNode curr = prev.next;

        for(int i =0; i < right - left; i++){
            ListNode forward = curr.next;
            curr.next = forward.next;
            forward.next = prev.next;
            prev.next = forward;
        }
        return dummy.next;
    }
}
