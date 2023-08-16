package enumsforcar;

public enum CarType {
    JEEP(42500),
    SEDAN(34000),
    COUPE(45000),
    MINIVAN(42500),
    LUXURY(90000),
    SPORTS_CAR(75000),
    ELECTRIC(65000),
    HYBRID(52500),
    COMPACT(27500),
    CROSSOVER(40000);

    private final int price;

    CarType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}



