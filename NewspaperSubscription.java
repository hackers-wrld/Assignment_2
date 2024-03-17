abstract class NewspaperSubscription {
    protected String SubscriberName;
    protected String SubscriberAddress;
    protected double SubscriberRate;


  

    public String getSubscriberName() {
        return this.SubscriberName;
    }

    public String getAddress() {
        return this.SubscriberAddress;
    }

    public double getSubscriberRate() {
        return this.SubscriberRate;
    }

    public void setSubscriberName(String subscriberName) {
        this.SubscriberName = subscriberName;
    }

    public abstract void setAddress(String address);
    public abstract void displayInformation();

    public void setSubscriberRate(double SubscriberRate) {
        this.SubscriberRate = SubscriberRate;
    }

    
}