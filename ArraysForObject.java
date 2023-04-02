class Student{
    int rollNo = 0;
    String name;
}
public class ArraysForObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Rahul";

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Raju";

        Student [] students = new Student[2];
        students[0] = s1;
        students[1] = s2;

        for (Student student : students) {
            System.out.println(student.name+" : "+student.rollNo);
        }
    }
}
