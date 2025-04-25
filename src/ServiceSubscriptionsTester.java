public class ServiceSubscriptionsTester {
    public static void main(String[] args) {
        
        for (ServiceSubscriptions p : ServiceSubscriptions.values()) {
        System.out.printf("The price of the subscription for %s is %.2f$%n", p, p.showCost());
        System.out.printf("The subscription for %s lasts %d month(s) %n", p, p.showSubscriptionLength());
        System.out.printf("The annual subscription cost for %s would be %.2f$%n", p, p.annualCost());
        System.out.printf("The cost per day for %s is %.2f$%n", p, p.costPerDay());
        }
    }
}
