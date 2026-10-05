public class substringBa {
    public static void substr(String str,String ans,int i){
        if(i ==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        substr(str,ans+str.charAt(i),i+1);
        substr(str,ans,i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        substr(str,"",0);
    }
    
}
