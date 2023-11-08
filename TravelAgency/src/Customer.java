import java.text.MessageFormat;
import java.util.Date;
import java.util.Objects;

public class Customer extends Person {

    private final Booking booking;


    public Customer(Booking booking, String name, Date dob, String email) {
        super(name, dob, email);
        this.booking = booking;
    }

    public Booking getBooking() {
        return booking;
    }


    @Override
    public String toString() {
        return MessageFormat.format("This is a customer and their name is {0}, dob: {1}, position: {2}", super.getName(), super.getDob(), super.getEmail());
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
