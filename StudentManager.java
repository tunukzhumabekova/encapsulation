import java.util.Arrays;

public class StudentManager {
private Student []students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public StudentManager(Student[] students) {
        this.students = students;
    }


    public String addAStudent(Student student) {
        for (Student b : students) {
            if (b.getName().equals(student.getName())) {
                return "такой студент уже есть";
            }
        }
        Student[] students1 = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            students1[i] = students[i];
        }
        students1[students.length]=student;
        students=Arrays.copyOf(students1,students1.length);
        return "Successfully added";
    }

    public Student[] removeStudent(Student studentName){
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i]==studentName){
                index=i;
                break;
            }
        }
        if(index==0){
            return students;
        }
        Student[] newArray = new Student[students.length - 1];
        if (index > 0) {
            System.arraycopy(students, 0, newArray, 0, index);
        }
        if (index < students.length - 1) {
            System.arraycopy(students, index + 1, newArray, index, students.length - index - 1);
        }
        return newArray;
    }


    public Student updateStudentByID(String StudentName, int newID){

        for (int i = 0; i < students.length; i++) {


            if (students[i].getName().equals(StudentName)) {
                students[i].setID(newID);
                return students[i];
            }
        }

        return null;
    }

    public Student [] getStudentByID(int ID){


        Student[] StudentsByID = new Student[0];

        for (Student student : students) {
            if ((ID) == student.getID()) {
                StudentsByID = Arrays.copyOf(StudentsByID, StudentsByID.length + 1);
                StudentsByID[StudentsByID.length - 1] = student;
            }
        }

        return StudentsByID;

    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
