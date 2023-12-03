// Step 1: Define an interface called Shape
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Step 2: Create an abstract class called AbstractShape
abstract class AbstractShape implements Shape {
    // Instance variables
    String color;
    double length;
    double width;

    // Constructor
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea method
    public abstract double calculateArea();

    // Implementation of calculatePerimeter method
    public abstract double calculatePerimeter();
}

// Step 3: Implement two concrete classes that extend AbstractShape
class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); // 0 and 0 for length and width as they are not applicable to a circle
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Step 4: In the Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Display their areas and perimeters
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
    }
}
