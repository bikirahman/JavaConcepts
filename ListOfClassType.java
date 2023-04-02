import java.util.ArrayList;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class ListOfClassType {
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(15, "Rahul"));
        students.add(new Student(25, "Vivek"));

        for (Student student : students) {
            System.out.println(student.age+" : "+student.name);
        }
    }
}
