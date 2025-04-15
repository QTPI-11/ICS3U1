import java.util.Scanner;

public class NandGate {
    public static void main (String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Boolean A");
        boolean A = keyboard.nextBoolean();
        System.out.println("Boolean B");
        boolean B = keyboard.nextBoolean();
        System.out.println("C is " + !(A && B));
        keyboard.close();

}}
