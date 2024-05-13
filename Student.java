
public class Student{
    String name;
    int Birthyear;
    public Student(String name , int Birthyear ){
        this.name = name;
        this.Birthyear = Birthyear;
    }
    public int  calculateage(int Birthyear){
        return 2024 - Birthyear;
    } 
    public void dispaly(){
        System.out.println("Name: " + name);
        System.out.println("Age: "+calculateage(Birthyear));
    }
    public static void main(String[] args) {
        Student s1=new Student("Gururaj", 2005);
        s1.calculateage(2005);
        s1.dispaly();
        
    }
}
