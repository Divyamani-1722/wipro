import java.util.Optional;

// Define the UserService interface.
interface UserService {
    // Default method returning a welcome message for a guest.
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    // Default method that returns an Optional containing the welcome message.
    // If name is provided, it returns "Welcome, {name}!".
    // If name is null, it returns the default welcome message.
    default Optional<String> getUser(String name) {
        return Optional.ofNullable(name)
                       .map(n -> "Welcome, " + n + "!")
                       .or(() -> Optional.of(getWelcomeMessage()));
    }
}

// Implementation of UserService.
// Here, we are using the default methods provided by the interface.
class UserServiceImpl implements UserService {
    // No need to override getWelcomeMessage() or getUser(String name) unless customization is required.
}

public class UserServiceDemo {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Case 1: Name is provided.
        Optional<String> welcomeMessageWithName = userService.getUser("Alice");
        System.out.println(welcomeMessageWithName.get());  // Output: Welcome, Alice!

        // Case 2: Name is not provided (null).
        Optional<String> welcomeMessageWithoutName = userService.getUser(null);
        System.out.println(welcomeMessageWithoutName.get());  // Output: Welcome, Guest!
    }
}
