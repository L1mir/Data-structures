package LinkedList;

public class LinkedList {
    private ListNode head;

    public LinkedList() {
        head = null;
    }

    public void insertAtBeginning(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void delete(int val) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head.val == val) {
            head = head.next;
            return;
        }
        ListNode prev = null;
        ListNode current = head;
        while (current != null && current.val != val) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Element not found. Cannot delete.");
            return;
        }
        prev.next = current.next;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.display();

        list.delete(20);
        list.display();
    }
}