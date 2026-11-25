public class mirror {
    static class Node{
        int data;
        Node root ;
        Node right;
        Node left;

        public Node(int data){
            this.data = data;
            this.left=this.right=null;
        }
    }
    public static Node createmirror(Node root){
        if(root == null){
            return null;
        }
        Node leftmirror = createmirror(root.left);
        Node rightmirror = createmirror(root.right);

        root.left = rightmirror;
        root.right = leftmirror;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
          Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        root = createmirror(root);
        preorder(root);
    }

    
}
