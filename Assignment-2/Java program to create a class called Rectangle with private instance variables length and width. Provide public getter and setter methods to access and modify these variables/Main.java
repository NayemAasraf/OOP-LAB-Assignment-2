public class Main {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle();

        rect.setLength(10.5);
        rect.setWidth(5.0);

        System.out.println("Rectangle Details:");
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        
        System.out.println("\nAttempting to set invalid width...");
        rect.setWidth(-2.0);
        
        System.out.println("Current Width: " + rect.getWidth());
    }
}