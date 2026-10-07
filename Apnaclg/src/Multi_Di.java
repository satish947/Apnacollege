import java.util.*;
public class Multi_Di {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
        ArrayList<Integer>list =new ArrayList<>();
        list.add(1);list.add(2);
        mainList.add(list);


        ArrayList<Integer>list1 =new ArrayList<>();
        list1.add(3);list1.add(4);
        mainList.add(list1);
        for (int i =1;i<mainList.size();i++){
            ArrayList<Integer>currList =mainList.get(i);
            for(int j= 0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        
        System.out.println(mainList);
    }
    
}
