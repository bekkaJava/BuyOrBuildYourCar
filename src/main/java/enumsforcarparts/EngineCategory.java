package enumsforcarparts;

public enum EngineCategory {
        GASOLINE(2000),
        DIESEL(2500),
        ELECTRIC(3000),
        HYBRID(2800),
        NATURAL_GAS(2200),
        SPORT(4000);

        private final int price;

        EngineCategory(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

}



