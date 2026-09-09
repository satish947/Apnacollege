import java.util.*;
public class vowels {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int count = 0;

        
        for(int i = 1; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch== 'i'|| ch=='o'||ch == 'u'){
                count += 1;
            }
        }
         System.out.println(count);
    }
    
}
