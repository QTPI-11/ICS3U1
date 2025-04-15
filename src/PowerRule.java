import java.util.Scanner;

public class PowerRule {

    public static String expressionSign(Double numValue) {
        String expressionSign = "";

        if (numValue >= 0) {
            expressionSign = " +";
        } else if (numValue < 0) {
            expressionSign = " ";
        }

        return expressionSign;
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input the coefficients of a polynomial's term on one line separated by spaces");
        String[] coefficients = keyboard.nextLine().split(" ");
        System.out.println("Please input the degrees of a polynomial's term on one line separated by spaces");
        String[] degrees = keyboard.nextLine().split(" ");
        keyboard.close();

        String term = "";
        for (int i = 0; i < coefficients.length; i++) {
            double c = Double.parseDouble(coefficients[i]);
            int d = Integer.parseInt(degrees[i]);
            double coefficientValue = c * d;
            Integer degreeValue = d - 1;

            if (degreeValue >= 1) {
                term = "x^" + degreeValue;
            } else if (degreeValue <= 0) {
                term = "";
            }

            if (coefficientValue != 0) {
                if (i == 0) {
                    System.out.print("Your first derivative is f'(x) = " + coefficientValue + term);
                } else {
                    System.out.print(expressionSign(coefficientValue) + coefficientValue + term);
                }
            } else {
                if (i == 0) {
                    System.out.print("Your first derivative is f'(x) = ");
                } // doesn't do anything if the condition above isn't met
            }
        }
        System.out.println();

        for (int i = 0; i < coefficients.length; i++) {
            double c = Double.parseDouble(coefficients[i]);
            int d = Integer.parseInt(degrees[i]);
            double coefficientValue = c * d * (d - 1);
            Integer degreeValue = d - 2;

            if (degreeValue >= 1) {
                term = "x^" + degreeValue;
            } else if (degreeValue <= 0) {
                term = "";
            }

            if (coefficientValue != 0) {
                if (i == 0) {
                    System.out.print("Your second derivative is f''(x) = " + coefficientValue + term);
                } else {
                    System.out.print(expressionSign(c * d) + coefficientValue + term);
                }
            } else {
                if (i == 0) {
                    System.out.print("Your second derivative is f''(x) = ");
                } // doesn't do anything if the condition above isn't met
            }
        }
    }
} //done