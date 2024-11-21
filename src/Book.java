public class Book extends LibraryItem {
    private int numberOfPages;
    private String publisher;

    // Constructor
    public Book(String title, String author, String itemID, int numberOfPages, String publisher) {
        super(title, author, itemID);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    // Overriding displayDetails Method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Publisher: " + publisher);
    }
}
