package com.NaimulHasanSabbir.LinkedListAndArrays.problem2.Optimal_Solution;

public class CopyListWithRandomPointer {
    static void insertCopyInBetween(Node head){
        Node temp = head;
        while(temp != null){
            Node nextElement = temp.next;
            Node copy = new Node(temp.data);
            copy.next = temp.next;
            temp.next = copy;
            temp = nextElement;
        }
    }
    static void connectRandomPointers(Node head){
        Node temp = head;
        while(temp != null){
            Node copyNode = temp.next;
            if(temp.random != null){
                copyNode.random = temp.random.next;
            }else{
                copyNode.random = null;
            }
            temp = temp.next.next;
        }
    }
    static Node cloneLL(Node head){
        Node temp = head;
        Node dummyNode  = new Node(-1);
        Node res = dummyNode;
        while(temp != null){
            res.next = temp.next;
            res = res.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummyNode.next;
    }
    static Node copyRandomList(Node head){
        if(head == null) return null;

        insertCopyInBetween(head);
        connectRandomPointers(head);
        return cloneLL(head);
    }
    static void printClonedLinkedList(Node head){
        while(head != null){
            System.out.print("Data:" + head.data);
            if(head.random != null){
                System.out.print(", Random:" + head.random.data);
            }else{
                System.out.print(", Random: null");
            }
            System.out.println();
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(14);
        head.next.next = new Node(21);
        head.next.next.next = new Node(28);

        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;

        System.out.println("Original Linked List with Random Pointers:");
        printClonedLinkedList(head);

        Node clonedList = copyRandomList(head);
        System.out.println("\nCloned Linked List with Random Pointers:");
        printClonedLinkedList(clonedList);
    }
}
