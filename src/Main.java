public class Main {
    public static void main(String[] args) {

        //Тест Треугольника
        //Задаем 3 точки-вершины
        Point pointA = new Point(2, -5);
        Point pointB = new Point(-6, 1);
        Point pointC = new Point(6, -2);

        //Создаем тестовый треугольник
        Triangle triangle = new Triangle(pointA, pointB, pointC);

        //Тест круга
        //Задаем две точки для радиуса
        Point pointD = new Point(7,2);
        Point pointE = new Point(-2, 14);

        //Создаем тестовый круг
        Circle circle = new Circle(pointD, pointE);

        //Создаем новую доску
        Board boardOne = new Board();

        boardOne.addFigure(triangle,1);
        boardOne.addFigure(circle,2);

        System.out.println(boardOne.boardInfo());

        boardOne.deleteFigure(1);
        System.out.println(boardOne.boardInfo());


    }
}
