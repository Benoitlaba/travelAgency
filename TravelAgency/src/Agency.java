import java.util.ArrayList;
import java.util.List;

public class Agency {

    private String name;
    private String webAddress;
    private List<Customer> customerList;
    private List<Employee> employeeList;
    private List<Booking> bookingList;

    public Agency(String name, String webAddress, List<Customer> customerList, List<Employee> employeeList, List<Booking> bookingList) {
        this.name = name;
        this.webAddress = webAddress;
        this.customerList = customerList;
        this.employeeList = employeeList;
        this.bookingList = bookingList;
    }

    public ArrayList<Customer> addCustomer(Customer customer) {

        ArrayList<Customer> list = new ArrayList<>();
        list.add(customer);

        return list;
    }
}
