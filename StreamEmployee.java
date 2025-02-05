import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeStreamDemo {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 28, 50000),
            new Employee("Bob", 35, 70000),
            new Employee("Charlie", 32, 65000),
            new Employee("Diana", 26, 48000),
            new Employee("Edward", 45, 90000)
        );

        // Filter employees older than 30.
        List<Employee> filteredEmployees = employees.stream()
                .filter(e -> e.getAge() > 30)
                .collect(Collectors.toList());

        // Find the average salary of employees who are older than 30.
        OptionalDouble averageSalary = filteredEmployees.stream()
                .mapToDouble(Employee::getSalary)
                .average();

        // Collect the names of these employees into a List.
        List<String> employeeNames = filteredEmployees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        // Print the list of employee names.
        System.out.println("Employees older than 30: " + employeeNames);

        // Print the average salary if present; otherwise, print a default message.
        if (averageSalary.isPresent()) {
            System.out.println("Average salary: " + averageSalary.getAsDouble());
        } else {
            System.out.println("No employees older than 30 found.");
        }
    }
}
