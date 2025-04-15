import java.util.Scanner;

public class SineLaw {
    public static void main (String[] args) throws Exception {
        //input the values for the triangle
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the angle in degrees given angle");
        Double angleA = keyboard.nextDouble();
        System.out.println("Please input the length of the side opposite to the angle");
        Double sideA = keyboard.nextDouble();
        System.out.println("Please input the length of the other side given");
        Double sideB = keyboard.nextDouble();

        //calculations
        double angleB = Math.asin(sideB * Math.sin(Math.toRadians(angleA)) / sideA);

        System.out.println("sideA = " + sideA);
        System.out.println("sideB = " + sideB);
        System.out.println("angleA is " + angleA);
        System.out.println("Angle B is: " + Math.toDegrees(angleB));     
        keyboard.close();
   





}}
