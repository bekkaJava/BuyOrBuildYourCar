package enumsforcarparts;

public enum NumberOFDoors {
        TWO_DOOR(1000),
        THREE_DOOR(1200),
        FOUR_DOOR(1500),
        FIVE_DOOR(1800),
        SIX_DOOR(2000);

        private final int price;

        NumberOFDoors(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;

        }
    }

