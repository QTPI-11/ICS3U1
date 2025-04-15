import java.util.Scanner;

public class App {

public static void main (String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("input a decimal");
    System.out.println("Your integer is " + (int) keyboard.nextDouble());
    keyboard.close();
    }
}
