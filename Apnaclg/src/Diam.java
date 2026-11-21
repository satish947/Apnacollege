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


    public static boolean isIdentical(Node node ,Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }
        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        return true;
        

    }
    public static boolean isSubtree(Node root,Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot);
    }
    public static void Klevel(Node root ,int level, int k){
        if(root== null){
            return;
        }
        if(level == k){
            System.out.print(root.data +" ");
            return ;
        }
        Klevel(root.left,level+1,k);
        Klevel(root.right,level+1,k);
    }


    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

        int k = 2;
         Klevel(root,1,k);
    }
}
