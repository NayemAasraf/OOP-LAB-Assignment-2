public class Main {
    public static void main(String[] args) {
        
        Circle myCircle = new Circle();
        
        myCircle.setRadius(5.0);

        System.out.println("Circle Details:");
        System.out.println("Radius: " + myCircle.getRadius());

        // Calculate and print Area
        double area = myCircle.calculateArea();
        System.out.println("Area: " + String.format("%.2f", area));

        // Calculate and print Perimeter
        double perimeter = myCircle.calculatePerimeter();
        System.out.println("Perimeter: " + String.format("%.2f", perimeter));

        // Test invalid input
        System.out.println("\nAttempting to set radius to -2.5...");
        myCircle.setRadius(-2.5);
        System.out.println("Current Radius: " + myCircle.getRadius());
    }
}