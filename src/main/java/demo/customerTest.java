package demo;

public class customerTest {
    public static void main(String[] args) {
        Customer first = new Customer("Paul L", "High Street", "0851234567", 1001, true);

        Customer second = new Customer();
        second.setName("Bob Jones");
        second.setAddress("2 Low Street");
        second.setPhoneNumber("0851234560");
        second.setCustomerNumber(1002);
        second.setMailingList(false);

        System.out.println(first);
        System.out.println(second);
    }
}
