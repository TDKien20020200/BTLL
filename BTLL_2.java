import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BTLL_2 {

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

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            return newNode;
        } else {
            SinglyLinkedListNode otherNode = head;
            while (otherNode.next != null) {
                otherNode = otherNode.next;
            }
            otherNode.next = newNode;
            return head;
        }
    }
    static void printLinkedList(SinglyLinkedListNode head) {
        if(head == null){
            return;
        } else {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
            llist.head = llist_head;
        }

        printLinkedList(llist.head);
        scanner.close();
    }
}
