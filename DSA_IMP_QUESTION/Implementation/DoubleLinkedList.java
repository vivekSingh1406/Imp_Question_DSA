class Node{

    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

    Node(int data,Node p,Node n){
        this.data=data;
        this.prev=p;
        this.next=n;
    }
}
public class DoubleLinkedList {

    private Node head=null;
    private Node tail=null;
    private int count=0;

    public void add(int data){

        if(head==null){
            head=new Node(data);
            tail=head;
            count++;
            return;
        }
        tail.next=new Node(data, tail, null);
        tail=tail.next;
        count++;
    }
    public void add(int data, int index) {

        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
    
        if (index == 0) {
            Node newNode = new Node(data, null, head);
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            count++;
            return;
        }
    
        if (index == size()) {
            Node newNode = new Node(data, tail, null);
            tail.next = newNode;
            tail = newNode;
            count++;
            return;
        }
    
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data, temp, temp.next);
        temp.next.prev = newNode;
        temp.next = newNode;
        count++;
    }
    
    public int size(){
        return count;
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
    
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            if (head == null) {
                tail = null;
            }
            count--;
            return;
        }
    
        if (index == size() - 1) {
            tail = tail.prev;
            tail.next = null;
            count--;
            return;
        }
    
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
    
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        count--;
    }
    

    public void printStart(){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void printEnd(){

        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.add(10);
        dl.add(20);
        dl.add(30);
        dl.add(40);

        System.out.println(dl.size());
        dl.printStart();

        // add index base
        dl.add(1,1);
        dl.printStart();
        
        dl.remove(1);
        dl.printStart();

    }
}
