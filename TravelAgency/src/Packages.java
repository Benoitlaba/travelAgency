public class Packages {

    private String description;
    private Boolean isAPackage;
    private Double price;
    private Flight flight;
    private Hotel hotel;
    private Car car;

    public Packages(String description, Boolean isAPackage, Double price, Flight flight, Hotel hotel, Car car) {
        this.description = description;
        this.isAPackage = isAPackage;
        this.price = price;
        this.flight = flight;
        this.hotel = hotel;
        this.car = car;
    }
}
