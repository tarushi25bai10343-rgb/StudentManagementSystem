import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
            System.out.println("----------------------");
        }
    }

    void searchStudent(int id) {
        for (Student student : students) {
            if (student.id == id) {
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
