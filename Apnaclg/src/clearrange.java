public class clearrange {
    public static int clearIbitsinrange(int n, int i , int j){
        int a =((~0)<<(j+1));
        int b = (1<<i)- 1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearIbitsinrange(10,2,5));
    }
    
}
