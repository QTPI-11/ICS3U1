
import java.util.Scanner;

public class CosineLaw {    
    public static void main (String[] args) throws Exception {

    //this is do input the a, b and angleC values for the Cosine Law
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input the value for a");
    Double a = keyboard.nextDouble();
    System.out.println("Input the value for b");
    Double b = keyboard.nextDouble();
    System.out.println("Input the value for angleC");
    Double angleC = keyboard.nextDouble();

    Double c = Math.sqrt((a*a)+(b*b)-2*a*b*Math.cos(Math.toRadians(angleC)));
    System.out.println("c = " + c);
    keyboard.close();


}}
