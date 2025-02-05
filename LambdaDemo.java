import java.util.*;

public class LambdaDemo {

    // Functional interface with a single abstract method.
    @FunctionalInterface
    interface StringProcessor {
        String process(String str);
    }

    public static void main(String[] args) {
        // Create a list of strings.
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date"));

        // Sort the list in reverse alphabetical order using a lambda expression.
        strings.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted in reverse alphabetical order:");
        strings.forEach(System.out::println);

        // Implement the StringProcessor functional interface using a lambda expression.
        // Here we can use a method reference to String::toUpperCase as a concise alternative.
        StringProcessor processor = s -> s.toUpperCase();
        // Alternatively, you could write:
        // StringProcessor processor = String::toUpperCase;

        // Process each string to uppercase and print the result.
        System.out.println("\nUppercase strings:");
        strings.forEach(s -> System.out.println(processor.process(s)));
    }
}
