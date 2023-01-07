package com.linkedlist;

public class ReverseLinkedList {



    private static void traverse(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data);
            cur = cur.next;
        }
    }

    private static Node reverse(Node head) {

        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        traverse(prev);
        return prev;
    }

    private static Node reserveByRecursiveMethod(Node head) {
        if (head == null || head.next == null)
            return head;
        Node newHead = reverse(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;

    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        traverse(head);
        System.out.println();
        System.out.println(reverse(head));
        reserveByRecursiveMethod(head);
    }
}
