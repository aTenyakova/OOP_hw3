import java.util.*;

class FigureCollection {
    List<Figure> figures = new ArrayList<>();

    void addFigure(Figure figure) {
        figures.add(figure);
    }

    void removeFigure(int index) {
        figures.remove(index);
    }

    void modifyFigure(int index, Square figure) {
        figures.set(index, figure);
    }

    void sortFiguresByArea() {
        Collections.sort(figures, Comparator.comparingDouble(Figure::getArea));
    }

    void printFiguresInfo() {
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                Triangle triangle = (Triangle) figure;
                System.out.println("Периметр треугольника: " + triangle.getPerimeter() + ", площадь: " + triangle.getArea());
            } else if (figure instanceof Square) {
                Square square = (Square) figure;
                System.out.println("Периметр квадрата: " + square.getPerimeter() + ", площадь: " + square.getArea());
            } else if (figure instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) figure;
                System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter() + ", площадь: " + rectangle.getArea());
            } else if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                System.out.println("Длина окружности: " + circle.getPerimeter() + ", площадь: " + circle.getArea());
            }
        }
    }
}