import java.util.*;
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
    public static boolean getpath(Node root,int n,ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getpath(root.left,n,path);
        boolean foundRight = getpath(root.right,n,path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }

    public static Node lca(Node root ,int n1,int n2){
        ArrayList<Node>path1 = new ArrayList<>();
        ArrayList<Node>path2 = new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);


        int i = 0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }

        }
        Node lca = path1.get(i-1);
        return lca;
    }
    public static int kAncestor(Node root,int n,int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = kAncestor(root.left,n,k);
        int rightDist = kAncestor(root.right,n,k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist,rightDist);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }


    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

       int n= 6,k=2;
       kAncestor(root,n,k);
    }
}
