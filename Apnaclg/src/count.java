public class count {
    public static void substring(String str,int i,int j){
        int count = 0;
        i=0;
        j = str.length()-1;
        if(str.charAt(i) == str.charAt(j)){
            count++;

        }
        System.out.print(count );
    }
    public static void main(String args[]){
        String str = "abca";
         int i=0;
        int j = str.length()-1;
        substring(str,i,j);


    }
    
}
