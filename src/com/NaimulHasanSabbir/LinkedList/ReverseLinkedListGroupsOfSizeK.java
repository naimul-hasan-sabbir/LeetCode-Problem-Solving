package com.NaimulHasanSabbir.LinkedList;

public class ReverseLinkedListGroupsOfSizeK {
    public static Node reverseLinkedList(Node head){
        Node temp = head;

        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static Node getKthNode(Node temp, int k){
        k -= 1;

        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    static Node KReverse(Node head, int k){
        Node temp = head;
        Node prevLast = null;
        while(temp != null){
            Node kThNode = getKthNode(temp, k);
            if(kThNode == null){
                if(prevLast != null){
                    prevLast.next = temp;
                }
                break;
            }
            Node nextNode = kThNode.next;
            kThNode.next = null;
            reverseLinkedList(temp);

            if(temp == head){
                head = kThNode;
            }else{
                prevLast.next = kThNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }
    static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(2);

        System.out.println("Original Linked List: ");
        printLinkedList(head);

        head = KReverse(head, 4);

        System.out.println("Reversed Linked List: ");
        printLinkedList(head);
    }
}
