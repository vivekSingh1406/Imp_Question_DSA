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
public class Insert_index_base_linkedList {
   
    Node head;
    int count=0;
    public void print() {
        Node temp=head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

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

    public void add_index(int data,int index){

        if(index==0){

            Node newNode = new Node(data, head);
            head=newNode;
            count++;
        }

        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.next=new Node(data, temp.next);
        count++;
    }
    public static void main(String[] args) {
      
        Insert_index_base_linkedList ls = new Insert_index_base_linkedList();

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
           ls.add(arr[i]);
        }

        ls.print();
        ls.add_index(11, 3);
        ls.print();
       

    }
}
