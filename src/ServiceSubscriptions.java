public enum ServiceSubscriptions {
    NETFLIX(15.99,1),
    HULU(20.49,2),
    DISNEY_PLUS(10.49, 1),
    AMAZON_PRIME(50.99,6),
    APPLE_TV(100.99, 12),
    TWITCH_PRIME(6.99,1),
    TWITTER_BLUE(8.49,1),
    SPOTIFY_PREMIUM(4.99,1),
    YOUTUBE_PREMIUM(20.99,6),
    HELLO_FRESH(400,1),
    DOLLAR_SHAVE_ClUB(4.99,1);

    private double cost;
    private int months;

    ServiceSubscriptions(double cost, int months){
        this.cost = cost;
        this.months = months;
    }

    public double showCost (){
        return cost;
    }

    public int showSubscriptionLength(){
        return months;
    }

    public double annualCost(){
        return this.cost*(12 / this.months);
    }

    public double costPerDay(){
        return this.cost/(30*this.months);
    }
}