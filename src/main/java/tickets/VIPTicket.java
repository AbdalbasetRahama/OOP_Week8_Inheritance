package tickets;

public class VIPTicket extends Tickets{

    public VIPTicket() {
        super();
    }

    public VIPTicket(String eventName, String holderName, double basePrice) {

        super(eventName, holderName, basePrice) ;
    }

    @Override
    public double calculatePrice() {

        return super.calculatePrice() + 25;
    }

    public String getBenefits() {
       return ("Priority entry and reserved seating");
    }
}
