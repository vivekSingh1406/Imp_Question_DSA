class Node{

    int data;
    Node next;

    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class ConvertArray_to_LinkedList {

    static Node convert_Linkedlist(int[] arr){
        Node head= new Node(arr[0]);
        Node mover=head;

        for (int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover=mover.next;
        }
        return head;
    }
    public static void main(String[] args){
        
        int[] arr={11,21,31,41,51,61,71,81,91,101};

        Node head=convert_Linkedlist(arr);
        System.out.print(head.data);
    }
}
