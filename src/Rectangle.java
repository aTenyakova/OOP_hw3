class Rectangle extends Figure {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double getPerimeter() {
        return 2 * (a + b);
    }

    double getArea() {
        return a * b;
    }
}