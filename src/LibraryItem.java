public class LibraryItem {
    private String title;
    private String author;
    private String itemID;

    // Constructor
    public LibraryItem(String title, String author, String itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    // Getter and Setter Methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getItemID() {
        return itemID;
    }

    // Display Method
    public void displayDetails() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
