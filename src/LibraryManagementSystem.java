import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Journal");
            System.out.println("3. Remove Item");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter Item ID: ");
                    String bookID = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String bookAuthor = scanner.nextLine();
                    System.out.print("Enter Number of Pages: ");
                    int pages = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Publisher: ");
                    String publisher = scanner.nextLine();
                    Book book = new Book(bookTitle, bookAuthor, bookID, pages, publisher);
                    library.addItem(book);
                    break;

                case 2:
                    // Add Journal
                    System.out.print("Enter Item ID: ");
                    String journalID = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String journalTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String journalAuthor = scanner.nextLine();
                    System.out.print("Enter Volume Number: ");
                    int volume = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Publication Date: ");
                    String publicationDate = scanner.nextLine();
                    Journal journal = new Journal(journalTitle, journalAuthor, journalID, volume, publicationDate);
                    library.addItem(journal);
                    break;

                case 3:
                    // Remove Item
                    System.out.print("Enter Item ID to remove: ");
                    String removeID = scanner.nextLine();
                    library.removeItem(removeID);
                    break;

                case 4:
                    // Display All Items
                    library.displayAllItems();
                    break;

                case 5:
                    // Exit
                    running = false;
                    System.out.println("Exiting Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
