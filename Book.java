public class Book {
    
    private String title;
    private String author;
    private boolean isAvailable;
 
    // Constructor A
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default to available
    }
    
    // Constructor B
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.isAvailable = true; // Default to available
    }
    
    public String getTitle() {
        return title;
    }   
    public String getAuthor() {
        return author;
    }    
    public boolean getIsAvailable() {
        return isAvailable;
    }
    
    // Borrow book method
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Successfully borrowed: " + title);
        } else {
            System.out.println("Error: '" + title + "' is already borrowed!");
        }
    }
    
    // Return book method
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Successfully returned: " + title);
        } else {
            System.out.println("'" + title + "' was not borrowed or already returned.");
        }
    }
    
    public void displayStatus() {
        System.out.println("Title: " + title + " | Author: " + author + 
                           " | Available: " + (isAvailable ? "Yes" : "No"));
    }
}