import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a 13 digit code");

        String isbn = keyboard.next();
        keyboard.close();
        int sum = 0;

        if (isbn.length() != 13) {
            System.out.println("this is not a valid ISBN number, it must be a 13 letter code.");
            System.exit(1);

        } else {
            for (int i = 0; i < isbn.length(); i++) {
                if (!Character.isDigit(isbn.charAt(i))) {
                    System.out.println("ISBN number contains non-digits!");
                    System.exit(1);
                } else if (i % 2 == 0) {
                    sum += Character.getNumericValue(isbn.charAt(i)) * 3;
                } else {
                    sum += Character.getNumericValue(isbn.charAt(i));
                }
            }
            System.out.println("your isbn code is valid: " + (sum % 10 == 0));
        }
    }
}