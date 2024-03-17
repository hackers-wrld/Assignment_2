public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    

    @Override
    public  void setAddress(String address) {
        // check if the adress contains a digit
        boolean AddressValid = checkAddressValid(address);
        if (AddressValid) {
            setSubscriberRate(15);
        } else {
            // does not contain a digit
            System.out.println("Address must contain at least one digit");
            setSubscriberRate(0);
        }
        this.SubscriberAddress = address;
    }

    private boolean checkAddressValid(String address) {
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) >= 48 && address.charAt(i) <= 57 ) {
                return true;
            }
        }

        return false;
    }

    public void displayInformation() {
        System.out.println("Subscriber Information:");
        System.out.println("Name:\t"+getSubscriberName());
        System.out.println("Address:\t"+getAddress());
        System.out.println("Rate:\tR"+getSubscriberRate());
    }
}
