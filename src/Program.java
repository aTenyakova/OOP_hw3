public class Program {
    public static void main(String[] args) {
        FigureCollection collection = new FigureCollection();
        try {
            Triangle triangle = new Triangle(9, 9, 9);
            Square square = new Square(8);
            Rectangle rectangle = new Rectangle(4, 6);
            Circle circle = new Circle(5);

            collection.addFigure(triangle);
            collection.addFigure(square);
            collection.addFigure(rectangle);
            collection.addFigure(circle);
        } catch (InvalidFigureException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Вывод информации о всех периметах, площадях и длиннах окружности всех фигур:");
        collection.printFiguresInfo();
        System.out.println();
        System.out.println("Сортировка по площади, вывод информации о всех фигурах:");
        collection.sortFiguresByArea();
        collection.printFiguresInfo();
        System.out.println();
        System.out.println("Удаление фигуры и изменение фигуры по ндексу:");
        collection.removeFigure(2);
        collection.modifyFigure(1, new Square(3));

        collection.printFiguresInfo();
    }
}