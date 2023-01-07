package com.linkedlist;

public class GetDecimalValue {
    private static void getDecimalValue(Node head) {
        int sum = 0;
        Node cur = head;
        while (cur != null) {
            sum = sum * 2 + cur.data;
            cur = cur.next;
        }
        System.out.println(sum);
    }

    private static void traverse(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(0);
        Node n3 = new Node(1);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        getDecimalValue(head);
    }
}