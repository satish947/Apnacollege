public class Abstract {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        chicken c1 = new chicken();
        c1.eat();
        c1.walk();
    }

    
}
abstract class Animal{
    void eat(){
        System.out.println("eats anything");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
