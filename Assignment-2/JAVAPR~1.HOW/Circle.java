public class Circle {

    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid input: Radius must be positive.");
        }
    }

    public double calculateArea() {
        // Area = π * r^2
        return Math.PI * this.radius * this.radius;
    }

    public double calculatePerimeter() {
        // Perimeter (Circumference) = 2 * π * r
        return 2 * Math.PI * this.radius;
    }
}