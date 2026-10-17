import java.util.Queue;
import java.util.LinkedList;

public class QueueStack2 {

    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push operation
        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop operation
        public int pop() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            Queue<Integer> q = !q1.isEmpty() ? q1 : q2;
            Queue<Integer> other = !q1.isEmpty() ? q2 : q1;

            while (q.size() > 1) {
                other.add(q.remove());
            }

            return q.remove();
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            Queue<Integer> q = !q1.isEmpty() ? q1 : q2;
            Queue<Integer> other = !q1.isEmpty() ? q2 : q1;

            while (q.size() > 1) {
                other.add(q.remove());
            }

            int top = q.remove();
            other.add(top);

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}