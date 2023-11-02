import java.util.Date;
import java.util.Objects;

public class Customer extends Person {

    Booking booking;


    public Customer(Booking booking, String name, Date dob, String email) {
        super(name, dob, email);
        this.booking = booking;
    }

    // Getter
    public Booking getBooking() {
        return booking;
    }


    //toString Override
    @Override
    public String toString() {
        return ("This is a customer");
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Customer customer = (Customer) obj;

        return Objects.equals(booking, customer.booking);

    }

    @Override
    public int hashCode() {
        return Objects.hash(booking);
    }
}
