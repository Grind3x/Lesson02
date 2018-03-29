public class Circle extends Shape {
    private Point pointA;
    private Point pointB;

    public Circle(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Circle() {
    }

    public double getPerimetr() {

        return 2 * Math.PI * getRadius();

    }

    public double getArea() {

        return Math.PI * (getRadius() * getRadius());

    }

    private double getRadius() {
        return Math.sqrt(((pointB.getX() - pointA.getX()) * (pointB.getX() - pointA.getX())) +
                ((pointB.getY() - pointA.getY()) * (pointB.getY() - pointA.getY())));
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    @Override
    public String toString() {
        return "Circle (" + pointA + "; " + pointB + ')';
    }
}
