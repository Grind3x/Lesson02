public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double getDiatence (Point pointOne, Point pointTwo) {
        return Math.sqrt((pointTwo.getX() - pointOne.getX())*(pointTwo.getX() - pointOne.getX()) +
                ((pointTwo.getY() - pointOne.getY())*(pointTwo.getY() - pointOne.getY())));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x +"," + y;
    }
}
