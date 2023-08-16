package enumsforcarparts;
public enum AirbagConfiguration {
    DRIVER_ONLY("Driver Only", 1000.0),
    PASSENGER_ONLY("Passenger Only", 1000.0),
    DRIVER_AND_PASSENGER("Driver and Passenger", 1500.0),
    DRIVER_AND_FRONT_PASSENGER("Driver and Front Passenger", 1500.0),
    ALL("All", 2000.0);

    private final String displayName;
    private final double price;

    AirbagConfiguration(String displayName, double price) {
        this.displayName = displayName;
        this.price = price;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getPrice() {
        return price;
    }
}
