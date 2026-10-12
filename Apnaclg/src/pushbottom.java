import java.util.*;
public class pushbottom {
    
        public static void addstackbottom(Stack<Integer>s,int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top = s.pop();
            addstackbottom(s,data);
            s.push(top);
        } 
        public static void reversestack(Stack<Integer> s){
            if(s.isEmpty()){
                return;
            }
            int top = s.pop();
            reversestack(s);
             addstackbottom(s,top);
        }
        public static void printstack(Stack<Integer> s){
            while(!s.isEmpty()){
                System.out.println(s.pop());
            }
        }

        
        
        public static void main(String args[]){
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
      reversestack(s);
      printstack(s);
       }

    }
   

    
    

