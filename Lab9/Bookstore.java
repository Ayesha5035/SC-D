package Lab9;
import java.util.*;

class Book {
    public String title;
    public double price;
    public int quantity;

    public Book(String title, double price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Method moved from Customer class
    public double applyDiscount(double percentage) {
        return price - (price * percentage / 100);
    }
}

class Customer {
    public String name;
    // applyDiscount removed from here
}

public class Bookstore {
    private List<Book> inventory = new ArrayList<>();
    
    public void addBook(Book book) {
        inventory.add(book);
    }
    
    public List<Book> getInventory() {
        return inventory;
    }

    public void displayInventory() {
        for (Book b : inventory) {
            if (b.quantity <= 0) {  // isSoldOut() inlined here
                System.out.println(b.title + " is out of stock.");
            } else {
                System.out.println(b.title + " - $" + b.price);
            }
        }
    }
}