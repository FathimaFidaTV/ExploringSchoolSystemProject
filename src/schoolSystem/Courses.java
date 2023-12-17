package schoolSystem;

import java.util.ArrayList;
import java.util.List;

// Courses.java
public class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> enrolledStudents = new ArrayList<>();

    // Constructors
    public Courses() {
    }

    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
    }

    // Methods
    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    public void unEnroll(Student student) {
        enrolledStudents.remove(student);
    }

    public int countStudents() {
        return enrolledStudents.size();
    }

    public int bestGrade() {
        int best = 0;
        for (Student student : enrolledStudents) {
            best = Math.max(best, student.grade);
        }
        return best;
    }
}
  /* public void enroll(Student[] students) {
        for (Student student : students) {
            enroll(student);
        }
    }
}
*/