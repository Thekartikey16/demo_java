sealed abstract class Shape permits Circle, Rectangle {
    abstract double area();
}

final class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    double area() {
        return Math.PI * r * r;
    }
}

final class Rectangle extends Shape {
    double l, b;
    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    double area() {
        return l * b;
    }
}

public class MainSealed {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}