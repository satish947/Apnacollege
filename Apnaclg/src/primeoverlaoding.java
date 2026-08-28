public class primeoverlaoding {
    public static boolean isprime(int n ){
        boolean isprime = true;
        for(int i =2; i<= n-1 ; i++){
            if(n % 2 == 0){
                isprime = false;
                break;
            }
        }return isprime;
    }public static void main(String args[]){
        System.out.println(isprime(9));
    }
    
}
