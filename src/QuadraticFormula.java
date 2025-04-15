import java.util.Scanner;

public class QuadraticFormula {
    public static void main (String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        //this is do input the a, b and c values for the quadratic equation
        System.out.println("Input the value for a");
        Double a = keyboard.nextDouble();
        System.out.println("Input the value for b");
        Double b = keyboard.nextDouble();
        System.out.println("Input the value for c");
        Double c = keyboard.nextDouble();

        //this displays the standard form 
        System.out.println("The standard form equation is " + a + "x*x + " + b + "x + " + c);
        Double root1 = ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
        Double root2 = ((-b-Math.sqrt(b*b-4*a*c))/(2*a));

        System.out.println("The roots of the quadratic is "+ root1 + " and " + root2);
        keyboard.close();


    }}


    