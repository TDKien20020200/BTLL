import java.util.Scanner;

public class BTLL_5 {
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

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        SinglyLinkedListNode newNode = llist;
        int i = position;
        while (i > 1) {
            newNode = newNode.next;
            i--;
        }
        if (newNode.next.next != null) {
             newNode.next = newNode.next.next;
        } else {
            newNode.next = null;
        }
        return llist;
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

        int position = scanner.nextInt();
        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

        printLL(llist.head);
    }
}
