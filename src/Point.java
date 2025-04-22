public class Point {

    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point difference(Point point){
        return new Point(point.getX() - this.x, point.getY() - this.y);
    }

    public void displayCoordinate(){
        System.out.println("The x cordinate is " + x);
        System.out.println("The y cordinate is " + y);
    }

    public double distance(Point point){
        return (Math.sqrt(Math.pow(point.getX() - this.x, 2) + (Math.pow(point.getY() - this.y, 2))));
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void linearEquation (Point point){
        System.out.println("y = " + slope(point) + "x "+ ((yIntercept(point) >= 0) ? "+" : "") + yIntercept(point));
    }

    public Point midPoint (Point point){
        return new Point((this.x + point.getX())/2, (this.y + point.getY())/2);
    }

    public double slope (Point point){
        return ((point.getY() - this.y)/(point.getX() - this.x));
    }

    public Point sum (Point point){
        return new Point(this.x + point.getX(), this.y + point.getY());
    }

    public double yIntercept(Point point){
        return (this.y - slope(point)*this.x);
    }
}// Finished but needs polishing