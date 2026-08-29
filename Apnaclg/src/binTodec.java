import java.util.*;
public class binTodec {
    public static void bintodec(int n ){
        int pow = 0;
        int decNum = 0;
        while(n>0){
            int lastdigit = n % 10;
            decNum = n +(lastdigit * (int)Math.pow(2,pow));
            pow++;
            n= n/10;

        }System.out.println(decNum);

    }public static void dectobin(int n){
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum =binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2; 
        }
        System.out.println(binNum);
    }public static void main(String args[]){
        bintodec(110);
        dectobin(10);
    }
  
}
   

