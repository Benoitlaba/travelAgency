import java.util.Objects;

public class Flight {

    private String destination;
    private Double price;

    public Flight(String destination, Double price) {
        this.destination = destination;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Flight flight = (Flight) obj;

        return Objects.equals(destination, flight.destination) && Objects.equals(price, flight.price);

    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, price);
    }

    @Override
    public String toString() {
        return ("This flight to " + destination + " costs $" + price);
    }
}
