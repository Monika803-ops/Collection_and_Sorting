import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Step 1: Create Employee class
class Employee {
    private String name;
    private int age;
    private double salary;

    // Step 2: Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters (optional, but useful for sorting)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Step 2: toString() for easy display
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {

        // Step 3: Store multiple employees in ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 28, 55000));
        employees.add(new Employee("David", 35, 70000));

        // Step 4: Sort by salary descending
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary()); // descending
            }
        });

        System.out.println("Employees sorted by salary (descending):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Step 5: Sort by name ascending
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName()); // ascending
            }
        });

        System.out.println("\nEmployees sorted by name (ascending):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
