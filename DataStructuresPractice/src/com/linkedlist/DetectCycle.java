package com.linkedlist;

public class DetectCycle {
    private static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return slow;
        }
        return null;
    }

    private static Node detectFirstNode(Node head) {
        Node meet = detectCycle(head);
        Node start = head;
        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start;
    }

    private static Node detectSecondNode(Node head) {
        Node meet = detectCycle(head);
        Node start = head;
        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        Node secondNode = start.next;
        return secondNode;
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
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        Node node = detectCycle(head);
        System.out.println(node.data);
        Node firstNode = detectFirstNode(head);
        System.out.println(firstNode.data);
        Node secondNode = detectSecondNode(head);
        System.out.println(secondNode.data);

    }
}
