package com.linkedlist;

public class DriverClass {

    private static void traverse(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data);
            cur = cur.next;
        }
    }

    private static void insert(int data, Node head, int pos) {
        Node toAdd = new Node(data);
        if (pos == 0) {
            toAdd.next = head;
            head = toAdd;
            return;
        }
        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;
    }

    private static void delete(Node head, int pos) {
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
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
        insert(5,head,4);
        traverse(head);
        System.out.println();
        delete(head,4);
        traverse(head);
        System.out.println();
        traverse(head);
    }


}
