package tickets;

public class Tickets {

    private String eventName;
    private String holderName;
    private double basePrice;

    public Tickets()  {
        this("", "", 80);
    }

    public Tickets(String eventName, String holderName, double basePrice) {
        this.eventName = eventName;
        this.holderName = holderName;
        this.basePrice = basePrice;
    }


    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double calculatePrice() {
        return basePrice;

    }

    @Override
    public String toString() {
        return
                holderName +":    " + "€" + calculatePrice() ;
    }
}







