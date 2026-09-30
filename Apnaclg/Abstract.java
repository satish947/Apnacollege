public class Abstract {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        System.out.println(h1.color);

        chicken c1 = new chicken();
        c1.eat();
        c1.walk();
    }

    
}
abstract class Animal{
    String color;
    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("eats anything");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changeColor(){
        color = "DarkBrown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends Animal{
    void changeColor(){
        color = "Red";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
