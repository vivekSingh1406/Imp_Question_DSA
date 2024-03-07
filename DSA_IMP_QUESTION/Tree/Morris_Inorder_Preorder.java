import java.util.ArrayList;
import java.util.List;
  
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class Morris_Inorder_Preorder {

    public static List < Integer > preorderTraversal(Node root) {
        List < Integer > preorder = new ArrayList < > ();
        Node cur = root;
        while (cur != null) {
            if (cur.left == null) {
                preorder.add(cur.data);
                cur = cur.right;
            } else {
                Node prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = cur;
                    preorder.add(cur.data);
                    cur = cur.left;
                } else {
                    prev.right = null;
                    cur = cur.right;
                }
            }
        }
        return preorder;
    }

     public static List<Integer> inorderTraversal(Node root) {
        List<Integer> inorder = new ArrayList<Integer>(); 
        
        Node cur = root; 
        while(cur != null) {
            if(cur.left == null) {
                inorder.add(cur.data); 
                cur = cur.right; 
            }
            else {
                Node prev = cur.left; 
                while(prev.right != null && prev.right != cur) {
                    prev = prev.right; 
                }
                
                if(prev.right == null) {
                    prev.right = cur;
                    cur = cur.left; 
                }
                else {
                    prev.right = null; 
                    inorder.add(cur.data); 
                    cur = cur.right; 
                }
            }
        }
        return inorder; 
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

        List<Integer> inorder = inorderTraversal(root);
        for(int i=0;i<inorder.size();i++){

            System.out.print(inorder.get(i)+" ");
        }

        System.out.println();

        List<Integer> postorder = preorderTraversal(root);
        for(int i=0;i<postorder.size();i++){
            
            System.out.print(postorder.get(i)+" ");
        }

        System.out.println();

    }
}
