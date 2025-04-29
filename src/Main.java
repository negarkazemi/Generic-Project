import products.*;
import  inventory.*;
public class Main {
    public static void main(String[] args) {

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        bookInventory.addItems(new Book("Author1", "Publisher1", "Genre1", "Book1", 17.99));
        bookInventory.addItems(new Book("Author2", "Publisher2", "Genre2", "Book2", 10.00));

        notebookInventory.addItems(new Notebook(130, true, "Notebook1", 5.50));
        notebookInventory.addItems(new Notebook(200, false, "Notebook2", 7.50));

        accessoryInventory.addItems(new Accessory("Accessory1", 7.4, "Red"));
        accessoryInventory.addItems(new Accessory("Accessory2", 15.99, "Blue"));

        System.out.println("----------Books in Inventory:");
        bookInventory.displayAll();

        System.out.println("\n----------Notebooks in Inventory:");
        notebookInventory.displayAll();

        System.out.println("\n----------Accessories in Inventory:");
        accessoryInventory.displayAll();

        System.out.println("\n----------removing item with ID '1001'");
        bookInventory.removeItemById("1001");
        System.out.println("\n----------removing item with ID '9999'");
        bookInventory.removeItemById("9999");

        System.out.println("\n----------Total price of Books: " + calculateTotalPrice(bookInventory));
        System.out.println("----------Total price of Notebooks: " + calculateTotalPrice(notebookInventory));
        System.out.println("----------Total price of Accessories: " + calculateTotalPrice(accessoryInventory));

        System.out.println("\n----------Searching for product with ID '2001':");
        System.out.println(notebookInventory.findItemsById(2001));

        System.out.println("\n----------Searching for product with ID '9999':");
        System.out.println(bookInventory.findItemsById(2222));

        bookInventory.applyDiscount("Book2", 10);
        notebookInventory.applyDiscount("Notebook1", 20);

        System.out.println("\n----------Books in Inventory after discount:");
        bookInventory.displayAll();

        System.out.println("\n----------Notebooks in Inventory after discount:");
        notebookInventory.displayAll();

        System.out.println("\n----------Accessories in Inventory:");
        accessoryInventory.displayAll();

    }

    public static double calculateTotalPrice (Inventory <? extends Product> inventory){

        double total = 0;

        for (Product product : inventory.getItems()) {
                total += product.getPrice();

        }

        return total;
    }


}
