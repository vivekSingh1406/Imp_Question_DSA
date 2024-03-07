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
public class LinkedList_length {

    Node head;
    int count=0;

    public void add(int data){

        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            count++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        count++;
    }
    
    public static void main(String[] args) {

        LinkedList_length ls = new LinkedList_length();
        
        int arr[] ={10,20,30,40,50,60,70,80,90,100};
        for(int i=0;i<arr.length;i++){
            ls.add(arr[i]);
        }

        System.out.println(ls.count);
        
    }
}
