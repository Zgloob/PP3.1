public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    };

    @Override
    double area() {
        return (Math
                .sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c)));
    };

    @Override
    double perimeter() {
        return (a + b + c);
    }
}
