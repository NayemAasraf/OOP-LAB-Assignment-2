public class Book {

    private String title;
    private String author;
    private double price;

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid input: Price must be positive.");
        }
    }

    // Method to apply discount
    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            double discountAmount = this.price * (percentage / 100);
            this.price = this.price - discountAmount;
        } else {
            System.out.println("Invalid discount percentage. Must be between 0 and 100.");
        }
    }
}