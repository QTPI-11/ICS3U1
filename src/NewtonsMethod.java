import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        while (true) {
            System.out.println("Please enter an initial root guess value:");
            double n = keyboard.nextDouble();
            double difference = 0;

            while (true) {
                double function = 6 * Math.pow(n, 4) - 13 * Math.pow(n, 3) - 18 * Math.pow(n, 2) + 7 * n + 6;
                double derivative = 24 * Math.pow(n, 3) - 38 * Math.pow(n, 2) - 36 * n + 7;
                difference = n;
                n -= function / derivative;
                System.out.println("The next successive root approximation is " + difference);

                if (Math.abs(n - difference) < 0.0000000000000000001) {
                    System.out.println("your root is " + difference);
                    break;
                }
            }
            System.out.println("do you want to try again?");

            if (keyboard.next().charAt(0) == 'n') {
                keyboard.close();
                break;
            }
        }
    }
} //done