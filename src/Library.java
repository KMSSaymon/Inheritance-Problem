import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;

    // Constructor
    public Library() {
        items = new ArrayList<>();
    }

    // Method to Add an Item
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    // Method to Remove an Item
    public void removeItem(String itemID) {
        for (LibraryItem item : items) {
            if (item.getItemID().equals(itemID)) {
                items.remove(item);
                System.out.println("Item removed successfully!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Method to Display All Items
    public void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the library.");
        } else {
            for (LibraryItem item : items) {
                System.out.println("-------------");
                item.displayDetails();
            }
        }
    }
}
