import java.util.ArrayList;
import java.util.List;

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
public class Left_Right_View {

    public static List<Integer> rightSideView(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }
    
    public static void rightView(Node curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.data);
        }
        
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1); 
    }

    //------------------- left view -----------------------

    public static List<Integer> leftSideView(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        leftView(root, result, 0);
        return result;
    }
    
    public static void leftView(Node curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.data);
        }
        
        leftView(curr.left, result, currDepth + 1);
        leftView(curr.right, result, currDepth + 1);
    }
    
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        List<Integer> right  = rightSideView(root);
        for(int i=0;i<right.size();i++){
            System.out.print(right.get(i)+" ");
        }
        System.out.println();

        // left view
        
        List<Integer> left = leftSideView(root);
        for(int i=0;i<left.size();i++){
            System.out.print(left.get(i)+" ");
        }
        System.out.println();

    }
}
