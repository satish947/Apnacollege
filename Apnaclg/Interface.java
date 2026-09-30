public class Interface {
    public static void main(String args[]){
        queen q1 = new queen();
        q1.moves();

    }
    
}
interface chess{
    void moves();

    
}
class queen implements chess{
     public void moves(){
        System.out.println("move in all 4 directions");

    }
}
class king implements chess{
    public void moves(){
        System.out.println("moves 1 step only ");
    }
}
