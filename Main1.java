import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        Student person1 = new Student("Frank", 35, 1236);
        Student person2 = new Student("Grace", 29, 7488);
        Student person3 = new Student("Henry", 33, 9638);
        Student person4 = new Student("Ivy", 27, 8475);
        Student person5 = new Student("John", 31, 9854);

        Student[] students = { person2, person3, person4, person5};
        StudentManager studentManager=new StudentManager(students);
        System.out.println(studentManager.addAStudent(person1));
        System.out.println(Arrays.toString(studentManager.removeStudent(person5)));
        System.out.println(Arrays.toString(studentManager.getStudentByID(1236)));
        System.out.println(studentManager.updateStudentByID("Frank",1234));
    }
}
