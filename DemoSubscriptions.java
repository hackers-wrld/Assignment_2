public class DemoSubscriptions {
    public static void main (String[] args) {
        System.out.println("hello world");
        String SubscriberName = "hackerswrld";
        String addressWithoutDigit = "Unit";
        String addressWithDigit = "Unit1";
        String emailWithoutAt = "example.com";
        String emailWithAt = "example@example.com";



        // newspaper subscription(physical) w/out a digit in the address
        NewspaperSubscription withoutDigit = new PhysicalNewspaperSubscription();
        withoutDigit.setSubscriberName(SubscriberName);
        withoutDigit.setAddress(addressWithoutDigit);
        withoutDigit.displayInformation();
        //newspaper subscription(physical) w/ a digit in the address
        NewspaperSubscription withDigit = new PhysicalNewspaperSubscription();
        withDigit.setSubscriberName(SubscriberName);
        withDigit.setAddress(addressWithDigit);
        withDigit.displayInformation();
        System.out.println("End Physical NewsPaper\n\n\n");

        // newspaper subscription(online) w/out at Sign in the address
        NewspaperSubscription withoutAt = new OnlineNewspaperSubscription();
        withoutAt.setSubscriberName(SubscriberName);
        withoutAt.setAddress(emailWithoutAt);
        withoutAt.displayInformation();
        //newspaper subscription(online) w/ a digit in the address
        NewspaperSubscription withAt = new OnlineNewspaperSubscription();
        withAt.setSubscriberName(SubscriberName);
        withAt.setAddress(emailWithAt);
        withAt.displayInformation();

    }
    
}
