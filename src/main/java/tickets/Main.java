package tickets;

public class Main {
    public static void main(String[] args) {

        Tickets ticket1 = new Tickets("Summer Concert", "Alice", 50);
        StudentTicket ticket2 = new StudentTicket("Summer Concert", "Bob", 50, "S12345");
        VIPTicket ticket3 = new VIPTicket("Summer Concert", "Charlie", 50);

        System.out.println("Event: " + ticket1.getEventName());
        System.out.println("Standard Ticket- " + ticket1);
        System.out.println("Student Ticket - " + ticket2);
        System.out.println("VIP Ticket     - " + ticket3);
        System.out.println("student ID: " + ticket2.getStudentId());
        System.out.println("Benefit: " + ticket3.getBenefits());

    }
}
