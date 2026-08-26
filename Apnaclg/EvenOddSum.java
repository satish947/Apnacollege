package Apnaclg;
import java.util.*;
public class EvenOddSum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum= 0;
        do{
            System.out.println("Enter a  number");
             number = sc.nextInt();
             if(number % 2== 0){
                evensum += number;
             }else{
                oddsum += number;
             }
             System.out.println("Do you want to stay ? press 1 to stay and 0 to exit");
             choice = sc.nextInt();

        }while(choice == 1);
        System.out.println(" Sum of even :"+evensum);
        System.out.println("Sum of odd:"+oddsum);


    }
    
}
