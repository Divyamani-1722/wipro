// Base Class: Item
class Item {
    private String title;
    private String author;
    private int publicationYear;

    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Derived Class: Book
class Book extends Item {
    private String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

// Derived Class: Magazine
class Magazine extends Item {
    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

// Main Class to demonstrate the Library System
public class LibrarySystem {
    public static void main(String[] args) {
        // Create Book and Magazine objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction");
        Magazine magazine1 = new Magazine("National Geographic", "Various Authors", 2024, 1103);

        // Display details of each item
        System.out.println("Book Details:");
        book1.displayDetails();
        System.out.println("\nMagazine Details:");
        magazine1.displayDetails();
    }
}
