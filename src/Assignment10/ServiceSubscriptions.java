package Assignment10;
public enum ServiceSubscriptions {

    NETFLIX(15.99,1,false, false),
    HULU(20.49,2,false,true),
    DISNEY_PLUS(10.49, 1,true,false),
    AMAZON_PRIME(50.99,6,false,true),
    APPLE_TV(100.99, 12,true,false),
    TWITCH_PRIME(6.99,1,true,true),
    TWITTER_BLUE(8.49,1,false,false),
    SPOTIFY_PREMIUM(4.99,1,true, false),
    YOUTUBE_PREMIUM(20.99,6,false,false),
    HELLO_FRESH(400,1,false, true),
    DOLLAR_SHAVE_ClUB(4.99,1,true,true);

    private double cost;
    private int months;
    private boolean giveAsGift;
    private boolean hasPromocode;

    ServiceSubscriptions(double cost, int months,boolean giveAsGift, boolean hasPromoCode){
        this.cost = cost;
        this.months = months;
        this.giveAsGift = giveAsGift;
        this.hasPromocode = hasPromoCode;
    }

    public double getCost(){
        return this.cost;
    }

    public int getSubscriptionLength(){
        return this.months;
    }

    public boolean getGiveAsGift(){
        return this.giveAsGift;
    }

    public boolean getHasPromoCode(){
        return this.hasPromocode;
    }

    public double annualCost(){
        return this.cost*(12 / this.months);
    }

    public double costPerDay(){
        return this.cost/(30*this.months);
    }
    public double cheapestCost(){
        return this.hasPromocode ? this.cost*0.8 : this.cost;
    }

    public void buyAsGift(){ 
        System.out.println(this + (this.giveAsGift ? " can ": " can't ") + "be bought to gift someone.");
    }
}