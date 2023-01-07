package com.linkedlist;

public class Palindrome {
    private static boolean palindrome(Node head) {

        Node mid = middle(head);
        Node last = reverse(mid.next);
        Node cur = head;
        while (last != null) {
            if (last.data != cur.data)
                return false;
            last = last.next;
            cur = cur.next;
        }
        return true;
    }

    private static Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

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
        System.out.println(palindrome(head));
    }
}
