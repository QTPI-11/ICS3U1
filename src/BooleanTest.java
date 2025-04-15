import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the value of Boolean A");
        boolean a = keyboard.nextBoolean();
        System.out.println("What is the value of Boolean B");
        boolean b = keyboard.nextBoolean();
        System.out.println("What is the value of Boolean C");
        boolean c = keyboard.nextBoolean();
        System.out.println("What is the value of Boolean D");
        boolean d = keyboard.nextBoolean();
        keyboard.close();

        System.out.println("The output value is " + (b && !d || !b && !c && d || !a && !b && !c || a && c && !d));

    }
} //done
