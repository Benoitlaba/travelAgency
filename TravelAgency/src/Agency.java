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

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customerList.remove(customer);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public void addBooking(Booking booking) {
        bookingList.add(booking);
    }

    public void removeBooking(Booking booking) {
        bookingList.remove(booking);
    }

    @Override
    public String toString() {
        return "Agency " +
                "name='" + name + '\'' +
                ", webAddress='" + webAddress + '\'' ;
    }
}
