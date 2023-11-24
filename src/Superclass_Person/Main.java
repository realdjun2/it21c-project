

package Superclass_Person;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Raldjun Gallentes Odon", 2002, "Bachelor of Science in Information Technology");

        System.out.println("Student Info: " + student);
        System.out.println("Student Major: " + student.getMajor());

        Instructor instructor = new Instructor("Phoebe Ruth Alithea Sudaria", 2002, 30000.0);

        System.out.println("Instructor Info: " + instructor);
        System.out.println("Instructor Salary: " + instructor.getSalary());
    }
}