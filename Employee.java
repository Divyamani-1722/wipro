Abstraction
// Abstract class
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
    public abstract void displayDetails();
}

// Full-Time Employee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee: " + name + " (ID: " + id + ")");
        System.out.println("Monthly Salary: $" + calculateSalary());
    }
}

// Part-Time Employee class
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee: " + name + " (ID: " + id + ")");
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

// Demo
public class EmployeeManagementDemo {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Alice", 101, 5000),
            new PartTimeEmployee("Bob", 102, 20, 100)
        };

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
}
