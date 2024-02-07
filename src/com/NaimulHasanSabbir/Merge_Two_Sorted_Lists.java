package com.NaimulHasanSabbir;

public class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val < list2.val){
            return mergeTwoListsUtil(list1, list2);
        }
        return mergeTwoListsUtil(list2, list1);
    }
    public ListNode mergeTwoListsUtil(ListNode list1, ListNode list2){
        ListNode current1 = list1;
        ListNode current2 = list2;

        ListNode next1 = list1.next;
        ListNode next2 = list2.next;

        while(next1 != null && current2 != null){
            if(current1.val <= current2.val && current2.val <= next1.val){
                ListNode next_current2 = current2.next;
                current1.next = current2;
                current2.next = next1;
                current1 = current1.next;
                current2 = next_current2;
                next1 = current1.next;
            }else{
                current1 = current1.next;
                next1 = next1.next;
            }
        }
        if(current2 != null){
            current1.next = current2;
        }
        return list1;
    }
}
