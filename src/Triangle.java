public class Triangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle() {
    }

    public double getPerimetr() {
        return pointA.getDistance(pointB) + pointA.getDistance(pointC) + pointB.getDistance(pointC);
    }

    public double getArea() {
        return (Math.abs((pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY()) -
                (pointC.getX() - pointA.getX()) * (pointB.getY() - pointA.getY())) / 2);
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

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle (" + pointA + "; " + pointB + "; " + pointC + ')';
    }
}
