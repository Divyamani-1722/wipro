import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add five integer elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Remove the third element (index 2)
        list.remove(2);

        // Update the second element (index 1) with a new value
        list.set(1, 100);

        // Display all the elements using a loop
        System.out.println("Updated ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
