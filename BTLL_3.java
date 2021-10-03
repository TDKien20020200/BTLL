import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

public class BTLL_3 {
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
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = llist;
        return newNode;
    }
    static void printLL(SinglyLinkedListNode head) {
        if (head == null) {
            return;
        } else {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scan.nextInt();
        for (int i = 0; i < llistCount; i++) {
            int llistItem = scan.nextInt();
            SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem);
            llist.head = llist_head;
        }
        printLL(llist.head);
        scan.close();
    }
}
