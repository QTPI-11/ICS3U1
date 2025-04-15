import java.util.Scanner;

public class BooleanTestHomework {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Boolean A");
        boolean A = keyboard.nextBoolean();
        System.out.println("Boolean B");
        boolean B = keyboard.nextBoolean();
        System.out.println("Boolean C");
        boolean C = keyboard.nextBoolean();
        System.out.println("Boolean D");
        boolean D = keyboard.nextBoolean();

        boolean andGate1 = (A && B);
        boolean andGate3 = (A && C);
        boolean andGate4 = (A && D);
        boolean andGate6 = (B && C);
        boolean andGate5 = (B && D);
        boolean andGate2 = (C && D);

        boolean orGate1 = (andGate1 || andGate2);
        boolean orGate2 = (andGate3 || andGate4);
        boolean orGate3 = (andGate5 || andGate6);

        boolean orGate4 = (orGate1 || orGate2);
        boolean orGate5 = (orGate2 || orGate3);

        boolean orGate6 = (orGate4 || orGate5);

        System.out.println(orGate6);
        keyboard.close();

    }
}
