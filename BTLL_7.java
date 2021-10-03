import java.util.Scanner;

public class BTLL_7 {
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
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(nodeData);

            if (head == null) {
                this.head = newNode;
            } else {
                this.tail.next = newNode;
            }
            this.tail = newNode;
        }
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        if (llist == null) {
            return null;
        } else {
            SinglyLinkedListNode nexNode = llist;
            SinglyLinkedListNode preNode = null;
            while (llist != null) {
                nexNode = llist.next;
                llist.next = preNode;
                preNode = llist;
                llist = nexNode;
            }
            llist = preNode;
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
        int tests = scanner.nextInt();

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }

            SinglyLinkedListNode llist1 = reverse(llist.head);
            printLL(llist1);
        }
        scanner.close();
    }
}
