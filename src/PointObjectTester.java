public class PointObjectTester {
    public static void main(String[] args) {
        // Create two points
        Point p1 = new Point(-10, -10);
        Point p2 = new Point(5, 5);

        // Test displayCoordinate()
        System.out.println("Testing displayCoordinate for p1:");
        p1.displayCoordinate();

        // Test difference
        Point diff = p1.difference(p2);
        System.out.println("\nTesting difference:");
        diff.displayCoordinate();

        // Test distance
        double dist = p1.distance(p2);
        System.out.println("\nTesting distance between p1 and p2:");
        System.out.println("Distance: " + dist);

        // Test midpoint
        Point mid = p1.midPoint(p2);
        System.out.println("\nTesting midpoint between p1 and p2:");
        mid.displayCoordinate();

        // Test sum
        Point sum = p1.sum(p2);
        System.out.println("\nTesting sum of p1 and p2:");
        sum.displayCoordinate();

        // Test slope
        double slope = p1.slope(p2);
        System.out.println("\nTesting slope between p1 and p2:");
        System.out.println("Slope: " + slope);

        // Test y-intercept
        double intercept = p1.yIntercept(p2);
        System.out.println("\nTesting y-intercept of line through p1 and p2:");
        System.out.println("Y-Intercept: " + intercept);

        // Test linearEquation
        System.out.println("\nTesting linearEquation for line through p1 and p2:");
        p1.linearEquation(p2);
    }
}