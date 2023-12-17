package schoolSystem;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("John", "Doe", 1, 75, 1);
        Student student2 = new Student("Jane", "Smith", 2, 55, 1);
        Student student3 = new Student("Bob", "Johnson", 3, 90, 1);

        // Create course
        Courses javaCourse = new Courses("Java Programming", "Dr. Smith", 2023);

        // Enroll students
        javaCourse.enroll(student1);
        javaCourse.enroll(student2);
        javaCourse.enroll(student3);

        // Test methods
        System.out.println("Number of students: " + javaCourse.countStudents());
        System.out.println("Best grade in the course: " + javaCourse.bestGrade());
    }
}
 /*      // Overloaded enroll method with an array of students
        Student[] additionalStudents = {new Student("Alice", "Johnson", 4, 80, 1),
                                        new Student("Charlie", "Brown", 5, 70, 1)};
        javaCourse.enroll(additionalStudents);

        // Verify the updated number of students
        System.out.println("Number of students after enrolling additional students: " + javaCourse.countStudents());

        // Test average grade function (Challenge)
        System.out.println("Average grade in the course: " + calculateAverageGrade(javaCourse));

        // Test ranking function (Challenge)
        displayRanking(javaCourse);

        // Test above/below average function (Challenge)
        showAboveBelowAverage(javaCourse);
    }

    // Challenge: Calculate average grade for a course
    private static double calculateAverageGrade(Courses course) {
        int sum = 0;
        for (Student student : course.enrolledStudents) {
            sum += student.grade;
        }
        return (double) sum / course.enrolledStudents.size();
    }

    // Challenge: Display ranking with all students enrolled in a course and respective grades
    private static void displayRanking(Courses course) {
        System.out.println("Ranking:");
        for (int i = 0; i < course.enrolledStudents.size(); i++) {
            Student student = course.enrolledStudents.get(i);
            System.out.println((i + 1) + ". " + student.firstName + " " + student.lastName + ": " + student.grade);
        }
    }

    // Challenge: Show if each student is above or below the course average
    private static void showAboveBelowAverage(Courses course) {
        double average = calculateAverageGrade(course);
        System.out.println("Above/Below Average:");
        for (Student student : course.enrolledStudents) {
            if (student.grade > average) {
                System.out.println(student.firstName + " " + student.lastName + ": Above Average");
            } else {
                System.out.println(student.firstName + " " + student.lastName + ": Below Average");
            }
        }
    }
}
*/
