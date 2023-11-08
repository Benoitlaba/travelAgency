import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //Person object
        Person person = new Person("Slarve",new Date(), "b2@gmail.com");
        //System.out.println(person.name);
        System.out.println(person);


        //Employee Objects
        Employee employee1 = new Employee("CEO","Jordan",new Date(), "Jordan@yahoo.com");
        Employee employee2 = new Employee("Manager","Clark",new Date(), "clark@yahoo.com");
        //Employee list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(0,employee1);
        employeeList.add(0,employee2);
        //Employee Test Data
        System.out.println("\n\r" + employee1); //Override toString example
        System.out.println("employee1.equals(employee2): " + employee1.equals(employee2)); //Override equals example
        System.out.println("employee1.hashCode(): " + employee1.hashCode());  //Override hashcode
        System.out.println("employee2.hashCode(): " + employee2.hashCode());  //Override hashcode


        //Flights test data
        Flight flight1 = new Flight("New York", 200.00);
        Flight flight2 = new Flight("Boston", 250.00);
        Flight flight3 = new Flight("Boston", 250.00);
        System.out.println("\n" + flight1); //Override toString
        System.out.println("flight1.equals(flight2): " + flight1.equals(flight2)); //Override equals example
        System.out.println("flight2.equals(flight3): " + flight2.equals(flight3)); //Override equals example
        System.out.println("flight3.equals(flight1): " + flight3.equals(flight1)); //Override equals example
        System.out.println("flight1.hashCode(): " + flight1.hashCode());  //Override hashcode
        System.out.println("flight2.hashCode(): " + flight2.hashCode());  //Override hashcode
        System.out.println("flight3.hashCode(): " + flight3.hashCode());  //Override hashcode


        Hotel hotel = new Hotel("Hyatt Agency", "9801 International Dr", 5);
        //System.out.println("\nHotel name: " + hotel.name);


        Car car = new Car("mazda", "mazda3", "blue");
        //System.out.println("\nCar name: " + car.model);


        //Packages
        Packages package1 =  new Packages("Lux Package", true,1500.00, flight1, hotel, car);
        //Payment
        Payment payment = new Payment("Credit Card", 100.05);


        //Booking objects
        Booking booking1 = new Booking(1,new Date(),package1,payment);
        Booking booking2 = new Booking(2,new Date(),package1,payment);
        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);


        //Customer Objects
        Customer customer1 = new Customer(booking1,"Josh",new Date(), "Josh@gmail.com");
        Customer customer2 = new Customer(booking2,"Marie",new Date(), "marie@gmail.com");
        //Customer list
        List<Customer> customerList = new ArrayList<>();
        customerList.add(0,customer1);
        customerList.add(1,customer2);
        //Customer Test Data
        System.out.println("\n\r" + customer2); //Override toString example
        System.out.println("customer1.equals(customer2): " + customer1.equals(customer2)); //Override equals example
        System.out.println("customer1.hashCode(): " + customer1.hashCode());  //Override hashcode
        System.out.println("customer2.hashCode(): " + customer2.hashCode());  //Override hashcode


        //Agency
        Agency agency = new Agency("CheapOair","https://www.cheapoair.com/",customerList,
                employeeList, bookingList);
        //System.out.println("\nAgency name: " + agency.toString());
    }
}