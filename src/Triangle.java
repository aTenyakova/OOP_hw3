class Triangle extends Figure {
    double a, b, c;

    Triangle(double a, double b, double c) throws InvalidFigureException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new InvalidFigureException("Недопустимые стороны треугольника: " + a + ", " + b + ", " + c);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getPerimeter() {
        return a + b + c;
    }

    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
