import java.util.Date;

public class Booking {

    int bookingNumber;
    Date bookingDate;
    Packages aPackages;
    Payment payment;

    public Booking(int bookingNumber, Date bookingDate, Packages aPackages, Payment payment) {
        this.bookingNumber = bookingNumber;
        this.bookingDate = bookingDate;
        this.aPackages = aPackages;
        this.payment = payment;
    }
}
