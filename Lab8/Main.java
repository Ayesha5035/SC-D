public class Main {
    
    public static void main(String[] args) {

        Media[] libraryMedia = new Media[3];

        libraryMedia[0] = new Book("The Great Gatsby", "Scribner", "F. Scott Fitzgerald", 180);
        libraryMedia[1] = new Magazine("National Geographic", "National Geographic Society", 456, "Monthly");
        libraryMedia[2] = new Book("Java Programming", "O'Reilly", "James Gosling", 500);
        
        for (Media e : libraryMedia) {
            e.displayDetails();
        }
        
}
}