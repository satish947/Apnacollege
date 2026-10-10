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

    LL.print();

    LL.addFirst(2);
    LL.print();

    LL.addFirst(1);
    LL.print();

    LL.addLast(3);
    LL.print();

    LL.addLast(4);
    LL.print();
}


}
