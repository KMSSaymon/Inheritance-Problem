public class Journal extends LibraryItem {
    private int volumeNumber;
    private String publicationDate;

    // Constructor
    public Journal(String title, String author, String itemID, int volumeNumber, String publicationDate) {
        super(title, author, itemID);
        this.volumeNumber = volumeNumber;
        this.publicationDate = publicationDate;
    }

    // Overriding displayDetails Method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Volume Number: " + volumeNumber);
        System.out.println("Publication Date: " + publicationDate);
    }
}
