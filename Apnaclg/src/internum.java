import java.util.*;
public class internum {
    public static void interleave(java.util.Queue<Integer> q){
        java.util.Queue<Integer> firsthalf = new java.util.LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
    firsthalf.add(q.remove());

        }
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());

        }
    }
    public static void main(String args[]){
       java.util. Queue<Integer> q = new java.util.LinkedList<>();
        q.add(1);
         q.add(2);
          q.add(3);
           q.add(4);
            q.add(5);
             q.add(6);
              q.add(7);
               q.add(8);
                q.add(9);
                 q.add(10);

                 interleave(q);
                 while(!q.isEmpty()){

                    System.out.print(q.remove() + " ");

                 }
                 System.out.println();


    }
    
}
