import java.util.*;
public class SumofDigits1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int digits = sc.nextInt();
        System.out.println("sum of digits is " + sumDigits(digits));
    }public static int sumDigits(int n){
        int sumofDigits =0;
        while(n>0){
        int lastDigit = n % 10;
        sumofDigits += lastDigit;
        n /= 10;
        } 
        return sumofDigits ; 
    }
    
}
