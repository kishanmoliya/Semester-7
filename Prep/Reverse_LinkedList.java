//  Write a program to reverse a singly linked list
// Input:
// 1 -> 2 -> 3 -> 4 -> 5
// 5 -> 4 -> 3 -> 2 -> 1
// Output:
// 5 -> 4 -> 3 -> 2 -> 1
// 1 -> 2 -> 3 -> 4 -> 5

public class Reverse_LinkedList {
    static Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void AddVal(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void reverseList(Node head) {
        Node prev = null;
        Node currNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
        }
        head = prev;
        System.out.println(head.val + " fff");
    }

    public void printList() {
        System.out.println(head.val + " g");
        System.out.println(head.next.val + " g");
        System.out.println(head.next.next.val + " g");
        System.out.println(head.next.next.next.val + " g");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Reverse_LinkedList list = new Reverse_LinkedList();
        list.AddVal(5);
        list.AddVal(4);
        list.AddVal(3);
        list.AddVal(2);

        list.reverseList(head);

        list.printList();
    }
}
