package tickets;

public class StudentTicket extends Tickets{
    private String studentId;

    public StudentTicket() {
        super();
        this.studentId = "";
    }

    public StudentTicket(String eventName, String holderName, double basePrice, String studentId)  {
        super(eventName, holderName, basePrice);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() * 0.8;
    }
}
