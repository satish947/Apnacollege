public class BinaryStr {
    public static void printBinstrings(int n ,int lastplace,String str){
        if(n ==0){
            System.out.println(str);
            return;
        }
        printBinstrings(n-1,0,str+"0");
        if(lastplace == 0){
            printBinstrings(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
        printBinstrings(3,0,"");
    }
    
}
