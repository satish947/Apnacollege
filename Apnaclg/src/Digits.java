public class Digits {
    static String digits[]={"zero","one","two","three","Four","Five","Six","Seven","Eight","Nine"};
    public static void PrintDigits(int number){
        if(number ==0){
            return;
        }
        int lastDigit = number%10;
        PrintDigits(number/10);
        System.out.print(digits[lastDigit] + " ");

    }
    
     public static void main(String args[]){
        PrintDigits(1346);
    }
    
}
