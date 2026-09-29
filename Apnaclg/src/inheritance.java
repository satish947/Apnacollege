public class inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
    
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
    
}
class Fish extends Animal{
    int Fins;
    void swim(){
        System.out.println("Swims");
    }
}
