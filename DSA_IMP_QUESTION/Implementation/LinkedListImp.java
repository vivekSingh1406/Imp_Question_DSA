class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

    Node(int data,Node n){
        this.data=data;
        this.next=n;
    }
}
public class LinkedListImp {

    private Node head=null;
    private int count=0;

    public void add(int data){

        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            count++;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        count++;
    }

    public void add(int data,int index){

        if(index<0 || index > size()){
            throw new IndexOutOfBoundsException();
        }

        if(index==0){
            head = new Node(data, head);
            count++;
            return;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.next=new Node(data, temp.next);
        count++;
    }

    public int size(){

        return count;
    }

    public void print(){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void remove(int index){

        if(index<0 || index > size()){
            throw new IndexOutOfBoundsException();
        }

        if(index==0){
            head=head.next;
            count--;
            return;
        }
        Node temp =head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        count--;
    }

    public void revers(){

        Node prev = null;
        Node next=null;
        Node curr = head;

        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        
        LinkedListImp l = new LinkedListImp();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l.size());
        l.print();

        l.add(1,0);
        l.add(11,3);
        l.add(21,2);
        l.print();
        // l.remove(2);
        // l.print();

        l.revers();
        l.print();

    }
    
}
