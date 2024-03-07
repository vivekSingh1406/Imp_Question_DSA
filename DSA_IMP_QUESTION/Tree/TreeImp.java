import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node rigth;

    Node(int data){
        this.data=data;
        this.left=null;
        this.rigth=null;
    }
}
public class TreeImp {

    Node root=null;

    public void add(int data){
        root=addNode(root,data);
    }
    private Node addNode(Node root,int data){

        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data > root.data){
            root.rigth=addNode(root.rigth, data);
        }
        else if(data < root.data){
            root.left=addNode(root.left, data);
        }
        return root;
    }


    public void levelOrder(){
        printLevel(root);
    }

    private void printLevel(Node root){

        Queue<Node> q1 = new LinkedList<>();

        q1.add(root);
        while (!q1.isEmpty()) {
             
            Node temp=q1.poll();
            System.out.print(temp.data+" ");

            if(temp.left!=null){
                q1.add(temp.left);
            }

            if(temp.rigth!=null){
                q1.add(temp.rigth);
            }
        }
   
    }

    public static void main(String[] args) {
        
        TreeImp t = new TreeImp();
        int arr[]={44,65,78,90,34,23,10,8,5,75,60};
        for(int i=0;i<arr.length;i++){
            t.add(arr[i]);
        }
        t.levelOrder();
    }

}
