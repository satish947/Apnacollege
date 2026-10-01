public class Optimizedpower {
    public static int OptimizedPower(int a , int n){
        if(n == 0){
            return 1;
        }

        int halfsq = OptimizedPower(a,n/2) *  OptimizedPower(a,n/2);
        if(n%2 != 0){
            halfsq = a*halfsq;
        }
        return halfsq;

    }
    public static void main(String args[]){
        System.out.print( OptimizedPower(2,10));
    }
    
}
