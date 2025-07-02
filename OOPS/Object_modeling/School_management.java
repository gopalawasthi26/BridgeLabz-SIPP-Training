import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    String name;
    List<Student> students;

    Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Enroll a student
    void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Show enrolled students
    void showEnrolledStudents() {
        System.out.println("Course: " + name + " - Enrolled Students:");
        for (Student s : students) {
            System.out.println("  " + s.name);
        }
    }
}

// Student class (Aggregated by School)
class Student {
    String name;
    List<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enroll in a course
    void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this);  // Maintain bidirectional association
        }
    }

    // View enrolled courses
    void viewCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("  " + c.name);
        }
    }
}

// School class (aggregates Students)
class School {
    String name;
    List<Student> students;

    School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Add a student
    void addStudent(Student student) {
        students.add(student);
    }

    // Display all students
    void showAllStudents() {
        System.out.println("School: " + name + " - Students:");
        for (Student s : students) {
            System.out.println("  " + s.name);
        }
    }
}
public class School_management {
    public static void main(String[] args) {
        // Create school
        School school = new School("Green Valley School");

        // Create students
        Student s1 = new Student("Anjali");
        Student s2 = new Student("Ravi");

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Add students to the school (Aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // Students enroll in courses (Association)
        s1.enrollInCourse(math);
        s1.enrollInCourse(science);

        s2.enrollInCourse(science);

        // Show school data
        school.showAllStudents();

        // Show student enrollments
        s1.viewCourses();
        s2.viewCourses();

        // Show course enrollments
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
