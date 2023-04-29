class Square extends Figure {
    double a;

    Square(double a) {
        this.a = a;
    }

    double getPerimeter() {
        return 4 * a;
    }

    double getArea() {
        return a * a;
    }
}