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
public class Middle_last_Element {

    Node head;

    public void add(int data){

        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public Node middleNode(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void midNode(){

        Node newNode = middleNode(head);

        while(newNode!=null){
            System.out.print(newNode.data+" ");
            newNode=newNode.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        Middle_last_Element ls = new Middle_last_Element();
        
        int arr[] ={10,20,30,40,50,60,70,80,90,100};
        for(int i=0;i<arr.length;i++){
            ls.add(arr[i]);
        }

       ls.midNode();
    }
}
