import java.util.EmptyStackException;

class Node{

    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class StackLinkedList {
    
    private Node head=null;
    private int count=0;
    public void add(int data){

       Node newNode = new Node(data);
       newNode.next=head;
       head=newNode;
       count++;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public int pop(){

        if(isEmpty()){
            throw new EmptyStackException();
        }
        int ans = head.data;
        head=head.next;
        count--;
        return ans;

    }

    public int peek(){

        if(isEmpty()){
            throw new EmptyStackException();
        }
        return head.data;
    }

    public static void main(String[] args) {
        
        StackLinkedList dl = new StackLinkedList();
        dl.add(10);
        dl.add(20);
        dl.add(30);

        System.out.println(dl.size());
        System.out.println(dl.peek());
        dl.pop();
        System.out.println(dl.peek());
    }

}
