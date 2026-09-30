public class Static1 {
    public static void main(String args[]){
        student s1 = new student();
        s1.schoolname= "Sapthagiri";
        System.out.println(s1.schoolname);
    }

    
    
}
class student{
    String name;
    int roll;
     

    static String schoolname;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;

    }

}
