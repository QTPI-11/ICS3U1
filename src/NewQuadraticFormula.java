import java.util.Scanner;

public class NewQuadraticFormula {
    public static void main (String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    
    //this is do input the a, b and c values for the quadratic equation
    System.out.println("Input the value for a");
    Double a = keyboard.nextDouble();
    System.out.println("Input the value for b");
    Double b = keyboard.nextDouble();
    System.out.println("Input the value for c");
    Double c = keyboard.nextDouble();

    if (b*b-4*a*c>0) { 
        Double root1 = ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
        Double root2 = ((-b-Math.sqrt(b*b-4*a*c))/(2*a));

        System.out.println("The roots of the quadratic is "+ root1 + " and " + root2);    
    }
    else if (b*b-4*a*c==0) {
        Double uniqueRoot = (-b/(2*a));

        System.out.println("the unique root of the quadratic is " + uniqueRoot);

    }
    else {
        System.out.println("No real roots");
    }

    keyboard.close();
}}
