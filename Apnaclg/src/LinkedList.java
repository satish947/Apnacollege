public class LinkedList {
public static Node head;
public static Node tail;

public void addFirst(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = tail = newNode;
        return;
    }

    newNode.next = head;
    head = newNode;
}

public void addLast(int data) {
    Node newNode = new Node(data);

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
    Node temp = head ;
    int i = 0;

    while(i<idx-1){
        temp = temp.next;
        i++;
    }
    newNode.next= temp.next;
    temp.next = newNode;
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

    LL.addLast(3);
    LL.print();

    LL.addLast(4);
    LL.add(2,9);
    LL.print();
}


}
