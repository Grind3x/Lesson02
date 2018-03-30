import java.util.Arrays;

public class Board {
    private Shape[] board = new Shape[4];

    public Board() {
    }

    public void addFigure(Shape shape, int part) {
        if ((part >= 0) & (part < board.length)) {
            board[part] = shape;
        }
    }

    public void deleteFigure(int part) {
        board[part] = null;
    }

    public String boardInfo() {
        double area = 0;
        for (Shape aBoard : board) {

            if (aBoard != null) {
                area = area + aBoard.getArea();
            }
        }

        return "Фигуры на доске:" + Arrays.toString(board) + '\n' + "Общая площадь: " + area;
    }

    public Shape[] getBoard() {
        return board;
    }

    public void setBoard(Shape[] board) {
        this.board = board;
    }
}
