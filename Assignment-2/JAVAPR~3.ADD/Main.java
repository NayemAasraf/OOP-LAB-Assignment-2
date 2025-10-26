public class Main {
    public static void main(String[] args) {
        
        Book book1 = new Book();
        book1.setTitle("1984");
        book1.setAuthor("George Orwell");
        book1.setPrice(15.50);

        System.out.println("Book: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Original Price: $" + String.format("%.2f", book1.getPrice()));

        // Apply a 10% discount
        System.out.println("\nApplying 10% discount...");
        book1.applyDiscount(10.0);

        System.out.println("Discounted Price: $" + String.format("%.2f", book1.getPrice()));

        // Apply an invalid discount
        System.out.println("\nApplying 150% discount...");
        book1.applyDiscount(150.0);
        System.out.println("Price (unchanged): $" + String.format("%.2f", book1.getPrice()));
    }
}