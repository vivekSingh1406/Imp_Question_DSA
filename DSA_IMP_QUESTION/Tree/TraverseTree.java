import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class TraverseTree {

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
            root.right=addNode(root.right, data);
        }
        else if(data < root.data){
            root.left=addNode(root.left, data);
        }
        return root;
    }

    public void preOrder(){

        ArrayList<Integer> ans = new ArrayList<>();
        preOrderTrav(root,ans);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }

    public void preOrderTrav(Node curr, ArrayList < Integer > preOrder) {

        if (curr == null)
            return;

        preOrder.add(curr.data);
        preOrderTrav(curr.left, preOrder);
        preOrderTrav(curr.right, preOrder);

        // we can change preorder,inorder and postorder using recursion
    }

    public static void main(String[] args) {
        
        TraverseTree t = new TraverseTree();
        int arr[]={44,65,78,90,34,23,10,8,5,75,60};
        for(int i=0;i<arr.length;i++){
            t.add(arr[i]);
        }
        t.preOrder();
    }
}
