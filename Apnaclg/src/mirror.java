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

    public static Node CreateBSt(int arr[] ,int st,int end){
        if(st > end){
            return null;
        }

        int mid= (st + end)/2;
        Node root = new Node(arr[mid]);
        root.left = CreateBSt(arr,st,mid-1);
        root.right = CreateBSt(arr,mid+1,end);
        return root;
    }
    public static void main(String args[]){
        int arr[] ={3,5,6,8,10,11,12};
        Node root = CreateBSt(arr,  0,arr.length-1);
        preorder(root);
    }

    
}
