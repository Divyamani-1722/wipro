Inheritance
// Abstract class Shape
abstract class Shape {
    public abstract void draw();
}

// Derived class - Circle
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Derived class - Rectangle
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class to demonstrate polymorphism
public class ShapeDrawingApp {
    public static void main(String[] args) {
        // Creating an array of Shape objects
        Shape[] shapes = { new Circle(), new Rectangle(), new Circle(), new Rectangle() };

        // Calling draw() method on each object
        for (Shape shape : shapes) {
            shape.draw();  // Demonstrates polymorphism
        }
    }
}
