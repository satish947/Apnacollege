public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

    }
}
    class Pen {
        String color;
        int tip;
    
        
        void setColor(String newcolor){
            color = newcolor;
        }
        void setTip(int newtip){
            tip = newtip;
        }
    }


