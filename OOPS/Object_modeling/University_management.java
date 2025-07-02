import java.util.ArrayList;
import java.util.List;

// Faculty class (aggregated - can exist independently)
class Faculty {
    String name;
    String specialization;

    Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Faculty: " + name + " | Specialization: " + specialization);
    }
}

// Department class (part of University - composition)
class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("  Department: " + name);
    }
}

// University class (composes Department, aggregates Faculty)
class University {
    String name;
    List<Department> departments;
    List<Faculty> faculties;

    University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: Department belongs only to this university
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: Faculty can be added but exists independently
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void display() {
        System.out.println("University: " + name);

        System.out.println("- Departments:");
        for (Department d : departments) {
            d.display();
        }

        System.out.println("- Faculties:");
        for (Faculty f : faculties) {
            f.display();
        }
    }

    // Simulate deletion (destroying composition)
    void destroy() {
        departments.clear();  // Composition: delete owned departments
        System.out.println("University '" + name + "' has been deleted along with all its departments.");
    }
}
public class University_management {
    public static void main(String[] args) {
        // Create faculty members independently
        Faculty f1 = new Faculty("Dr. Sharma", "Physics");
        Faculty f2 = new Faculty("Dr. Kapoor", "Mathematics");

        // Create a university
        University uni = new University("National University");

        // Add departments (composition)
        uni.addDepartment("Physics");
        uni.addDepartment("Mathematics");

        // Add faculty (aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Display structure
        uni.display();

        // Delete the university (composition effect)
        System.out.println("\n--- Deleting University ---");
        uni.destroy();

        // Faculty still exists independently
        System.out.println("\n--- Faculty Members Still Exist ---");
        f1.display();
        f2.display();
    }
}
