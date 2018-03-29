public class Board {
    private static Shape[] board = new Shape[4];

    public Board() {
    }

    public static void addFigure(Shape shape, int part) {
        board[part] = shape;
    }

    public static void deleteFigure(int part) {
        board[part] = null;
    }

    public static void boardInfo() {
        double area = 0;

        System.out.println("Фигуры на доске:");
        for (int i = 0; i < board.length; i++) {
            System.out.println(board[i]);
        }

        for (int i = 0; i < board.length; i++) {

            if (board[i] != null) {
                area = area + board[i].getArea();
            }

        }
        System.out.printf("Общая площадь: %.2f%n%n", area);
    }

    public static Shape[] getBoard() {
        return board;
    }

    public static void setBoard(Shape[] board) {
        Board.board = board;
    }


}
