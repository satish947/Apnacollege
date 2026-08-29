import java.util.*;
public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        System.out.print(avg(x,y,z));

    }public static double avg(double x ,double y,double z){
       return (x + y + z)/3;

    }
   
    
}
