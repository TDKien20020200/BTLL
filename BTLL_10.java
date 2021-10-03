import java.util.Scanner;

public class BTLL_10 {
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
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode newNode = llist;
        int dem = 0;
        int[] arr = new int[1000];
        while (newNode != null) {
            arr[dem] = newNode.data;
            dem++;
            newNode = newNode.next;
        }
        dem = dem - positionFromTail - 1;
        return arr[dem];
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

            int position = scanner.nextInt();
            int result = getNode(llist.head, position);

            System.out.print(result);
        }
        scanner.close();
    }
}
