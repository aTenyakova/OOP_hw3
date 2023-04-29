class Circle extends Figure {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    double getArea() {
        return Math.PI * r * r;
    }
}