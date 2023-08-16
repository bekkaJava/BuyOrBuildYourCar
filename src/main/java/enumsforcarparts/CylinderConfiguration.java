package enumsforcarparts;

public enum CylinderConfiguration {
    INLINE_4(0),
    INLINE_6(1000),
    V6(1500),
    V8(2000),
    V10(2500),
    V12(3000);

    private final int price;

    CylinderConfiguration(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
