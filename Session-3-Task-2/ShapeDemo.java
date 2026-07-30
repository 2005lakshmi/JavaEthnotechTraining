
abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    void calculateArea() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        s.calculateArea();

        s = new Rectangle(4, 6);
        s.calculateArea();

        s = new Triangle(8, 5);
        s.calculateArea();
    }
}