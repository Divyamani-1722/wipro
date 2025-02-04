import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store student roll numbers and names
        HashMap<Integer, String> students = new HashMap<>();

        // Insert five student records
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Emma");

        // Display all student records
        System.out.println("Student Records: " + students);

        // Retrieve and display the name of a student using a specific roll number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number to search for student: ");
        int rollNumber = scanner.nextInt();
        if (students.containsKey(rollNumber)) {
            System.out.println("Student with roll number " + rollNumber + ": " + students.get(rollNumber));
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }

        // Remove a student entry using a roll number
        System.out.print("Enter roll number to remove student: ");
        int rollToRemove = scanner.nextInt();
        if (students.remove(rollToRemove) != null) {
            System.out.println("Student with roll number " + rollToRemove + " has been removed.");
        } else {
            System.out.println("Student with roll number " + rollToRemove + " not found.");
        }

        // Display all student records after removal
        System.out.println("Updated Student Records: " + students);

        // Close the scanner
        scanner.close();
    }
}
