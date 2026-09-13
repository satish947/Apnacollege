public class clearBit {
    public static int clrarithBit(int n , int i ){
        int bitMask = ~(1<<i);
        return n & bitMask;

    }
    public static void main(String args[]){
        System.out.println(clrarithBit(10,2));
    }
    
}
