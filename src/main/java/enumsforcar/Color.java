package enumsforcar;

public enum Color {
    RED(100),
    BLUE(120),
    GREEN(90),
    YELLOW(80),
    BLACK(150),
    WHITE(130),
    SILVER(140),
    GRAY(110),
    ORANGE(95),
    PURPLE(105),
    PINK(115),
    BROWN(100),
    CYAN(125),
    MAGENTA(110),
    LIME(85),
    TEAL(95),
    INDIGO(115),
    MAROON(105),
    OLIVE(90),
    NAVY(120),
    AQUA(125),
    BEIGE(110),
    CORAL(120),
    CRIMSON(130),
    FUCHSIA(110),
    GOLD(150),
    KHAKI(105),
    LAVENDER(115),
    MAUVE(115),
    TURQUOISE(125),
    VIOLET(110),
    SALMON(125),
    TAN(100),
    WHEAT(105),
    PLUM(120),
    APRICOT(100),
    CERULEAN(110),
    EMERALD(130),
    PERIWINKLE(115),
    RUBY(140),
    SAGE(95),
    TANGERINE(100);

    private final int price;

    Color(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
