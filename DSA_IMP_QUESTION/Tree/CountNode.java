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

public class CountNode{

    public static void inOrderTrav(Node  curr, int count[]) {
    if (curr == null)
        return;

    count[0]++;
    inOrderTrav(curr . left, count);
    inOrderTrav(curr . right, count);
}

    public static void main(String args[]) {

        Node  root = new Node(1);
        root . left = new Node(2);
        root . right = new Node(3);
        root . left . left = new Node(4);
        root . left . right = new Node(5);
        root . right . left = new Node(6);

        int count[]=new int[1];
        inOrderTrav(root, count);

        System.out.println("The total number of nodes in the given complete binary tree are: "+count[0]);
    }
}
