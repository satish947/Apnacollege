public class polymorphism {
    public static void  main(String args[]){
        calculator Calc = new calculator();
        System.out.println(Calc.sum(4,6));
        System.out.println(Calc.sum((float)4.5,(float)5.5));
    }

    
}
class calculator{
    int sum(int a , int b){
        return a + b;
    }
    float sum( float a , float b){
        return a + b;
    }

}
