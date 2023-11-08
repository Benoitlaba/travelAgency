import java.util.Date;

public class Booking {

    private int bookingNumber;
    private Date bookingDate;
    private Packages aPackages;
    private Payment payment;

    public Booking(int bookingNumber, Date bookingDate, Packages aPackages, Payment payment) {
        this.bookingNumber = bookingNumber;
        this.bookingDate = bookingDate;
        this.aPackages = aPackages;
        this.payment = payment;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Packages getPackages() {
        return aPackages;
    }

    public void setPackages(Packages aPackages) {
        this.aPackages = aPackages;
    }
}
