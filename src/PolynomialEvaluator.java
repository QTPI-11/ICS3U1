import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Consider f(x)=3x^3 -5x^2 +1x^4 +9x^6 +3.1x^1 +2. Give a polynomial just like this");
        String fx = keyboard.nextLine();

        System.out.println("Now give the value for x");
        int x = keyboard.nextInt();
        keyboard.close();

        double sum = 0;

        StringTokenizer st = new StringTokenizer(fx, " ");

        while (st.hasMoreTokens()) {
            String term = st.nextToken();

            if (!term.contains("x")) {
                sum += Double.parseDouble(term);
            } else if (!term.contains("^")) {
                double coefficient = Double.parseDouble(term.substring(0, term.indexOf("x")));
                sum += coefficient * x;
            } else if (term.contains("^")) {
                double coefficient = Double.parseDouble(term.substring(0, term.indexOf("x")));
                int exponent = Integer.parseInt(term.substring(term.indexOf("^") + 1));
                sum += coefficient * Math.pow(x, exponent);
            }
        }
        System.out.println("f(" + x + ") = " + sum);
    }
} //done