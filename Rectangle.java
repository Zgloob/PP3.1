public class Rectangle extends Shape {
    private double a;
    private double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    };

    @Override
    double area() {
        return (a * b);
    };

    @Override
    double perimeter() {
        return (2 * a + 2 * b);
    }
}
