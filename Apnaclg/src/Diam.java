public class Diam {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftht = height(root.left);
        int rightDiam = diameter(root.right);
        int rightht = height(root.right);


        int selfdiam = leftht + rightht +1;

        return Math.max(selfdiam,Math.max(leftDiam,rightDiam));

    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

        System.out.print(diameter(root));
    }
}
