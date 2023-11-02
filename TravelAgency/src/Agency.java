import java.util.List;

public class Agency {

    String name;
    String webAddress;
    List<Customer> customerList;
    List<Employee> employeeList;
    List<Booking> bookingList;

    public Agency(String name, String webAddress, List<Customer> customerList, List<Employee> employeeList, List<Booking> bookingList) {
        this.name = name;
        this.webAddress = webAddress;
        this.customerList = customerList;
        this.employeeList = employeeList;
        this.bookingList = bookingList;
    }
}
