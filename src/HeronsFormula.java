import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) throws Exception {

        // this line scans output
        Scanner keyboard = new Scanner(System.in);

        // these lines asks the user for the side lengths of the triangle
        System.out.println("Input the value for sideA");
        double A = keyboard.nextDouble();
        System.out.println("Input the value for sideB");
        double B = keyboard.nextDouble();
        System.out.println("Input the value for sideC");
        double C = keyboard.nextDouble();

        // this line does the math for the area of the triangle
        double area = Math.sqrt((4 * A * A * B * B) - (A * A + B * B - C * C) * (A * A + B * B - C * C)) / 4;

        // this line outputs the area of the triangle
        System.out.println("the area of the tringle is " + area);

        keyboard.close();
    }
} //done
