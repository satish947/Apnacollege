public class LinkedList {
public static Node head;
public static Node tail; 
public static int size;


public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;

    if (head == null) {
        head = tail = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
}

public void addLast(int data) {
    Node newNode = new Node(data);
    size++;

    if (head == null) {
        head = tail = newNode;
        return;
    }

    tail.next = newNode;
    tail = newNode;
}

public void print() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }

    System.out.println();
}
public void add(int idx,int data){
    Node newNode = new Node(data);
    size++;
    Node temp = head ;
    int i = 0;

    while(i<idx-1){
        temp = temp.next;
        i++;
    }
    newNode.next= temp.next;
    temp.next = newNode;
}
public int removeFirst(){
    int val =head.data;
    head = head.next;
    return val;
}
public int itrsearch(int key){
    Node temp = head ;
    int i = 0;
    while(temp != null){
        if(temp.data == key){
            return i ;
        }
        temp = temp.next;
        i++;
    }
    return -1;
}
public int helper(Node head,int key){
    if(head == null){
        return - 1;
    }
    if(head.data == key){
        return 0;
    }
    int idx = helper(head.next,key);
    if(idx == -1){
        return -1;
    }
    return idx+1;
}
public int recsearch(int key){
    return helper(head,key);
}
public void reverse(){
    Node prev = null;
    Node curr= tail = head;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
}
public void DeleteNthnode(int n){
    int sz = 0;
    Node temp = head;
    while(temp != null){
        temp = temp.next;
        sz++;
    }
    if(n==sz){
        head = head.next;
        return;
    }
    int i = 1;
    int iToFind = sz-n;
    Node prev = head;
    while(i< iToFind){
        prev = prev.next;
        i++;
    }
    prev.next  =prev.next.next;
    return;

}
public Node findmid(Node head){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next !=null){
        slow = slow.next;
        fast = fast.next;
    }
    return slow;

}
public boolean checkpalindrome(){
    if(head == null || head.next == null){
        return true;
    }
    Node midNode = findmid(head);

    Node prev = null;
    Node curr = midNode;
    Node next;

    while(curr!= null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev;
    Node left = head;

    while(right != null){

       
            if(left.data != right.data){
                return false;
            }
            left = left.next;

            right = right.next;
        
    }
    return true;
}




static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public static boolean isCycle(){
    Node slow = head;
    Node fast = head;
     

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            return true;
        }
    }
    return false;
}

public static void main(String args[]) {
head = new Node(1);
head.next = new Node(2);
head.next.next = new Node (3);
head.next.next.next = head;
System.out.println(isCycle());

}


}
