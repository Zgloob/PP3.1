public class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    };

    @Override
    double area() {
        return ((radius * radius) * 3.14);
    }

    @Override
    double perimeter() {
        return (radius * 2 * 3.14);
    }
}
