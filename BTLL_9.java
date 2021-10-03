import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class BTLL_9 {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode newnode = new SinglyLinkedListNode(nodeData);

            if (head == null) {
                this.head = newnode;
            } else {
                this.tail.next = newnode;
            }
            this.tail = newnode;
        }
    }

    static void printLL(SinglyLinkedListNode head) {
        if (head == null) {
            return;
        } else {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedList newList = new SinglyLinkedList();
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                newList.insertNode(head1.data);
                head1 = head1.next;
            } else {
                newList.insertNode(head2.data);
                head2 = head2.next;
            }
        }
        while (head1 != null) {
            newList.insertNode(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            newList.insertNode(head2.data);
            head2 = head2.next;
        }
        return newList.head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();
            int llist1Count = scanner.nextInt();
            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printLL(llist3);
        }
        scanner.close();
    }
}
