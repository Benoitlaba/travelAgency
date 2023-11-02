import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //Person object
        Person person = new Person("Slarve",new Date(), "b2@gmail.com");
        System.out.println(person.name);
        System.out.println(person.toString());

        //Employee objects
        Employee employee = new Employee("CEO","Jordan",new Date(), "Jordan@yahoo.com");
        Employee employeeOther = new Employee("Manager","Clark",new Date(), "clark@yahoo.com");
        //Employee list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(0,employee);
        employeeList.add(0,employeeOther);
        System.out.println(employee.toString());

        //Packages
        Packages packages =  new Packages();

        //Payment
        Payment payment = new Payment();

        //Booking object
        Booking booking = new Booking(1,new Date(),packages,payment);

        //Customer objects
        Customer customer = new Customer(booking,"Josh",new Date(), "Josh@gmail.com");
        Customer customerOther = new Customer(booking,"Marie",new Date(), "marie@gmail.com");
        //Customer list
        List<Customer> customerList = new ArrayList<>();
        customerList.add(0,customer);
        customerList.add(1,customerOther);
        System.out.println(customer.name);
        System.out.println(customer.toString());

        //Agency agency = new Agency()


        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("gitignore test");
//        }
    }
}