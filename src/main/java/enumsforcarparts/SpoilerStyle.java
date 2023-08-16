package enumsforcarparts;

public enum SpoilerStyle {
    NONE(0),
    NORMAL(100),
    SPORT(200);

    private final int price;

    SpoilerStyle(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
