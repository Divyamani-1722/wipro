import java.util.HashSet;
import java.util.Scanner;

public class CityHashSet {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> cities = new HashSet<>();

        // Add five city names, including a duplicate
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("London"); // Duplicate entry

        // Display the elements in the set
        System.out.println("Cities in the HashSet: " + cities);

        // Check if a particular city exists in the set
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city to check: ");
        String cityToCheck = scanner.nextLine();
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " is in the set.");
        } else {
            System.out.println(cityToCheck + " is not in the set.");
        }

        // Remove a city from the set
        System.out.print("Enter a city to remove: ");
        String cityToRemove = scanner.nextLine();
        if (cities.remove(cityToRemove)) {
            System.out.println(cityToRemove + " has been removed.");
        } else {
            System.out.println(cityToRemove + " was not found in the set.");
        }

        // Display the updated set
        System.out.println("Updated Cities in the HashSet: " + cities);

        // Close the scanner
        scanner.close();
    }
}
