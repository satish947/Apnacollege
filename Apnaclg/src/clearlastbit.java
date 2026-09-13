public class clearlastbit {
    public static int clearlastbit(int n , int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearlastbit(15,2));
    }
    
}
