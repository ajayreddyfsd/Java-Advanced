interface Shape {
    double area();
}

class Circle implements Shape {
    public double area() {
        return 3.14 * 5 * 5;
    }
}

class Square implements Shape {
    public double area() {
        return 4 * 4;
    }
}

// Accepts only Shape or classes that implement Shape
class ShapePrinter<T extends Shape> {
    T shape;

    ShapePrinter(T shape) {
        this.shape = shape;
    }

    void printArea() {
        System.out.println("Area: " + shape.area());
    }
}

public class Main2 {
    public static void main(String[] args) {
        ShapePrinter<Circle> c = new ShapePrinter<>(new Circle());
        c.printArea(); // Area of circle

        ShapePrinter<Square> s = new ShapePrinter<>(new Square());
        s.printArea(); // Area of square
    }
}
