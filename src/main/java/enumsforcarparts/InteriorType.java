package enumsforcarparts;

public enum InteriorType {
    CLOTH(100),
    LEATHER(500),
    VINYL(150),
    SUEDE(200),
    WOOD(300),
    CARBON_FIBER(600),
    PLASTIC(50);

    private final int price;

    InteriorType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
