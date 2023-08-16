package enumsforcarparts;

public enum TransmissionType {
    MANUAL(0),
    AUTOMATIC(1000),
    TIPTRONIC(1500);

    private final int price;

    TransmissionType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
