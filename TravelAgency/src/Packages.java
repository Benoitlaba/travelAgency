public class Packages {

    String description;
    Boolean isAPackage;
    Double price;
    Flight flight;
    Hotel hotel;
    Car car;

    public Packages(String description, Boolean isAPackage, Double price, Flight flight, Hotel hotel, Car car) {
        this.description = description;
        this.isAPackage = isAPackage;
        this.price = price;
        this.flight = flight;
        this.hotel = hotel;
        this.car = car;
    }
}
