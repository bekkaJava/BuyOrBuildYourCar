package enumsforcar;

public enum Year {

    YEAR_2016(25000),
    YEAR_2017(26000),
    YEAR_2018(27000),
    YEAR_2019(28000),
    YEAR_2020(29000),
    YEAR_2021(30000),
    YEAR_2022(31000),
    YEAR_2023(32000);

    private final int price;

    Year(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}




