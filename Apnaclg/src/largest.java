public class largest {
    public static int getlargest(int numbers[]){
        int largest =Integer.MIN_VALUE;
             for (int i = 0; i<numbers.length;i++){
             if( i <= numbers[i] ){
                largest = numbers[i];
             }
    }
    return largest;
}
public static void main(String args[]){
    int numbers[] = {1,5,78,99};
    System.out.println("largest: "+ getlargest(numbers));
}
}
