import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    String courseName;
    Professor professor;
    List<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    void assignProfessor(Professor prof) {
        this.professor = prof;
        prof.assignCourse(this);
        System.out.println("Professor " + prof.name + " assigned to course: " + courseName);
    }

    void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this);
            System.out.println("Student " + student.name + " enrolled in course: " + courseName);
        }
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("  Professor: " + (professor != null ? professor.name : "None"));
        System.out.println("  Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("    " + s.name);
        }
    }
}

// Student class
class Student {
    String name;
    List<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course course) {
        course.enrollStudent(this); // triggers bidirectional communication
    }

    void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    void viewCourses() {
        System.out.println("Student: " + name + " - Enrolled in:");
        for (Course c : courses) {
            System.out.println("  " + c.courseName);
        }
    }
}

// Professor class
class Professor {
    String name;
    List<Course> courses;

    Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    void viewCourses() {
        System.out.println("Professor: " + name + " - Teaches:");
        for (Course c : courses) {
            System.out.println("  " + c.courseName);
        }
    }
}

// University class (aggregates students and professors)
class University {
    String name;
    List<Student> students;
    List<Professor> professors;

    University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void addProfessor(Professor p) {
        professors.add(p);
    }

    void showPeople() {
        System.out.println("University: " + name);
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("  " + s.name);
        }

        System.out.println("Professors:");
        for (Professor p : professors) {
            System.out.println("  " + p.name);
        }
    }
}
public class University_mange {
    public static void main(String[] args) {
        // Create university
        University uni = new University("GLA University");

        // Create students
        Student gopal = new Student("Gopal Awasthi");
        Student riya = new Student("Riya Sharma");

        // Create professors
        Professor drKumar = new Professor("Dr. Kumar");
        Professor drVerma = new Professor("Dr. Verma");

        // Add to university
        uni.addStudent(gopal);
        uni.addStudent(riya);
        uni.addProfessor(drKumar);
        uni.addProfessor(drVerma);

        // Create courses
        Course java = new Course("Core Java");
        Course dbms = new Course("Database Systems");

        // Assign professors
        java.assignProfessor(drKumar);
        dbms.assignProfessor(drVerma);

        // Enroll students
        gopal.enrollCourse(java);
        gopal.enrollCourse(dbms);
        riya.enrollCourse(dbms);

        // Show university info
        System.out.println();
        uni.showPeople();

        // Show course details
        System.out.println();
        java.showCourseDetails();
        dbms.showCourseDetails();

        // View student's and professor's courses
        System.out.println();
        gopal.viewCourses();
        drVerma.viewCourses();
    }
}
