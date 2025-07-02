    import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void display() {
        System.out.println("    Employee: " + name + " | Role: " + role);
    }
}

// Department class
class Department {
    String name;
    List<Employee> employees;

    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    void display() {
        System.out.println("  Department: " + name);
        for (Employee emp : employees) {
            emp.display();
        }
    }
}

// Company class (Composition owner)
class Company {
    String name;
    List<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    Department getDepartment(String deptName) {
        for (Department d : departments) {
            if (d.name.equals(deptName)) {
                return d;
            }
        }
        return null;
    }

    void display() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.display();
        }
    }

    void destroy() {
        // Simulate destruction by clearing all departments and employees
        departments.clear();
        System.out.println("Company '" + name + "' has been deleted along with all departments and employees.");
    }
}
public class Company_department {
    public static void main(String[] args) {
        Company company = new Company("TechNova");

        // Add departments
        company.addDepartment("Engineering");
        company.addDepartment("HR");

        // Add employees
        Department eng = company.getDepartment("Engineering");
        eng.addEmployee("Alice", "Software Engineer");
        eng.addEmployee("Bob", "DevOps Engineer");

        Department hr = company.getDepartment("HR");
        hr.addEmployee("Charlie", "HR Manager");

        // Display structure
        company.display();

        // Destroy company (composition: departments and employees also gone)
        System.out.println("\n--- Deleting Company ---");
        company.destroy();
    }
}
