class Node {
  
    int data;   
    Node next;  
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Delete_Cycle {

    public static boolean detectCycle(Node head) {
    
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
     
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; 
            }
        }
        return false;
    }

    public static void main(String[] args) {
     
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        if (detectCycle(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

    }
}