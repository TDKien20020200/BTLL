import org.omg.CORBA.ServiceInformationHelper;
import org.omg.CosNaming.NamingContextPackage.NotEmptyHelper;

import java.util.Scanner;

public class BTLL_4 {
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
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        int i = position;
        if (llist == null) {
            return newNode;
        } else {
            SinglyLinkedListNode oNode = llist;
            while (i > 1) {
                oNode = oNode.next;
                i--;
            }
            if (oNode.next != null) {
                SinglyLinkedListNode anoNode = oNode.next;
                oNode.next = newNode;
                newNode.next = anoNode;
            } else {
                oNode.next = newNode;
            }
            return llist;
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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            llist.insertNode(llistItem);
        }

        int data = scanner.nextInt();
        int position = scanner.nextInt();

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

        printLL(llist_head);
    }
}
