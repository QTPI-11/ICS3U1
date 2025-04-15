import java.util.Scanner;

public class AmbigousCase {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the angle in degrees given angle");
        double angleA = keyboard.nextDouble();
        System.out.println("Please input the length of the side opposite to the angle");
        double sideA = keyboard.nextDouble();
        System.out.println("Please input the length of the other side given");
        double sideB = keyboard.nextDouble();
        keyboard.close();

        double h = sideB * Math.sin(Math.toRadians(angleA));
        double height = Math.round(h * 1) / 1;

        // acute triangle
        if (angleA <= 90) {
            if (sideA < height) {
                System.out.println("There are no possible triangles");
            } else if (sideA == height) {
                System.out.println("There is one possible right triangle");
            } else if (sideA > sideB) {
                System.out.println("There is one possible triangle");
            } else if (sideA < sideB) { 
                System.out.println("There are two possible triangles (ambiguous case)");
            }
            // obtuse triangle
        } else if (angleA < 180) {
            if (sideA < sideB | sideA == height) {
                System.out.println("There are no possible triangles");
            } else {
                System.out.println("There is one possible triangle");
            }
        }
    }
} //done
