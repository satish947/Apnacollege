public class constructor {
    public static void main(String args[]){
        Student s1= new Student("satish");
        System.out.print(s1.name);

    }
    
}
class Student{
    String name;
    int roll;

    Student(String name){
        this.name = name;
    }

}
