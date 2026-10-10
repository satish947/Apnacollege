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




static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public static void main(String args[]) {
    LinkedList LL = new LinkedList();

    LL.addFirst(2);

    LL.addFirst(1);

    LL.addLast(4);
    LL.print();

    LL.addLast(5);
    LL.add(2,3);
    //LL.print();
    //System.out.print(LL.size);
    //LL.removeFirst();
    //LL.print();
    System.out.println(LL.itrsearch(3));
    System.out.println(LL.itrsearch(10));
}


}
