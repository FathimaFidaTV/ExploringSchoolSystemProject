package schoolSystem;

//Student.java
public class Student {
 String firstName;
 String lastName;
 int registration;
 int grade;
 int year;

//Constructors
 public Student() {
 }

 public Student(String firstName, String lastName, int registration, int grade, int year) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.registration = registration;
     this.grade = grade;
     this.year = year;
 }

 public Student(String firstName, String lastName, int registration) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.registration = registration;
     this.grade = 0;
     this.year = 1;
 }

//Methods
 public void printFullName() {
     System.out.println(firstName + " " + lastName);
 }

 public boolean isApproved() {
     return grade >= 60;
 }

 public int changeYearIfApproved() {
     if (isApproved()) {
         year++;
         System.out.println("Congratulations!");
     }
     return year;
 }
}

