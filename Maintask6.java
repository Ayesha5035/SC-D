public class Maintask6 {
    public static void main(String[] args) {
        System.out.println("=== LIBRARY BOOK MANAGEMENT SYSTEM ===\n");    
        Book book1 = new Book("The Great Hero", "Nimra");
        Book book2 = new Book("Java"); // Author will be "Unknown"
        
        System.out.println("Initial Status:");
        book1.displayStatus();
        book2.displayStatus();
        
        System.out.println("\n--- Borrowing Process ---");
        
        // Attempt to borrow the first book twice
        System.out.println("\nFirst attempt to borrow '" + book1.getTitle() + "':");
        book1.borrowBook();
        
        System.out.println("\nSecond attempt to borrow '" + book1.getTitle() + "':");
        book1.borrowBook(); 
        
        // Return the book
        System.out.println("\n--- Returning Process ---");
        System.out.println("Returning '" + book1.getTitle() + "':");
        book1.returnBook();
        
        // Try borrowing it again after return
        System.out.println("\nBorrowing '" + book1.getTitle() + "' again after return:");
        book1.borrowBook();
        
        System.out.println("\n=== FINAL BOOK STATUS ===");
        System.out.println("\nBook 1:");
        book1.displayStatus();
        System.out.println("\nBook 2:");
        book2.displayStatus();  
     }
}