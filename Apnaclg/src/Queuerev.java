import java.util.*;
public class Queuerev {
    public static void reverse(java.util.Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        java.util.Queue<Integer> q = new java.util.LinkedList<>();
        for(int i = 1 ; i<=5;i++){
            q.add(i);
        }
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+ " ");

        }
        System.out.println();
    }
}
