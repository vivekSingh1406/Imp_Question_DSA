import java.util.Stack;

class Node {
    int data;
    Node  left, right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
  
public class CheckBST{

    public static boolean isValidBST(Node root) {
        if (root == null) return true;
        Stack<Node> stack = new Stack<>();
        Node pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre != null && root.data <= pre.data) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }
  
    public static void main(String args[]) {
  
        Node  root = new Node(1);
        root . left = new Node(2);
        root . right = new Node(3);
        root . left . left = new Node(4);
        root . left . right = new Node(5);
        root . right . left = new Node(6);
  
        System.out.println(isValidBST(root));

        Node  root1 = new Node(90);
        root1.left = new Node(50);
        root1.left.left = new Node(40);
        root1.left.right = new Node(70);

        root1.right = new Node(150);
        root1.right.left = new Node(110);
        root1.right.left.left = new Node(100);
        root1.right.left.right = new Node(130);

        root1.right.right = new Node(180);
        root1.right.right.left = new Node(170);
        root1.right.right.right = new Node(200);
        root1.right.right.right.right = new Node(210);
        root1.right.right.right.left = new Node(190);

        System.out.println(isValidBST(root1));
    }
  }
  