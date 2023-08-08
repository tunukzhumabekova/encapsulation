package SecondTask;

public class MainStudent {
    public static void main(String[] args) {

        Student person1 = new Student("Frank", 35, "Java");
        Student person2 = new Student("Grace", 29, "JS");
        Student person3 = new Student("Henry", 33, "JS");
        Student person4 = new Student("Ivy", 27, "Java");
        Student person5 = new Student("John", 31, "JS");

        Student[] students = {person1, person2, person3, person4, person5};
        int javaCount = 0;
        int jsCount = 0;


        int ageSum = 0;

        for (int i = 0; i < students.length; i++) {
             if (students[i].getGroup().equals("Java")) {
                javaCount++;
            } else if (students[i].getGroup().equals("JS")) {
                jsCount++;
            }

            ageSum += students[i].getAge();
        }

        // Вывод результатов
        System.out.println("Студентов из JAVA: " + javaCount);
        System.out.println("Студентов из JS: " + jsCount);

        float averageAge = (float) ageSum / students.length;
        System.out.println("Средний возраст студентов: " + averageAge);
    }
}
