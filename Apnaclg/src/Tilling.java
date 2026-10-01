public class Tilling {
    public static int TillingSize(int n){
        if(n == 0 || n==1){
            return 1;
        }
        int fnm1 =TillingSize(n-1);
        int fnm2 = TillingSize(n-2);
        int ways = fnm1 + fnm2;
        return ways;
    }
    public static void main(String args[]){
        System.out.println(TillingSize(4));
    }
    
}
