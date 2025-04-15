public class QuadraticObjectTester {
    
    public static void main(String[] args) {
        // Example 1: Create an object of the Quadratic class
        Quadratic quadratic = new Quadratic(1, -3, 2);

        // Display the quadratic's forms and properties
        quadratic.getStandardForm();  // f(x) = ax^2 + bx + c
        quadratic.getFactoredForm();  // f(x) = a(x - root1)(x - root2)
        quadratic.getVertexForm();    // f(x) = a(x - h)^2 + k
        System.out.println("Vertex: (" + quadratic.getVertex()[0] + ", " + quadratic.getVertex()[1] + ")");
        System.out.println("Y-Intercept: " + quadratic.getYIntercept());
        System.out.println("Has real roots: " + quadratic.hasRealRoots());
        System.out.println("Is maximum? " + quadratic.isMaximum());
        
        // Example 2: Create another object with different coefficients
        Quadratic quadratic2 = new Quadratic(1, 2, 5);
        
        // Display for the second quadratic
        quadratic2.getStandardForm(); 
        quadratic2.getFactoredForm();
        quadratic2.getVertexForm();
        System.out.println("Vertex: (" + quadratic2.getVertex()[0] + ", " + quadratic2.getVertex()[1] + ")");
        System.out.println("Y-Intercept: " + quadratic2.getYIntercept());
        System.out.println("Has real roots: " + quadratic2.hasRealRoots());
        System.out.println("Is maximum? " + quadratic2.isMaximum());
    }
}
