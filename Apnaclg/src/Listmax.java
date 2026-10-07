import java.util.ArrayList;
public class Listmax {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(5);
        
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<list.size();i++){
            if(max<list.get(i)){
                max = list.get(i);
               
            }
        }
      System.out.print(max);
    }
    
}
