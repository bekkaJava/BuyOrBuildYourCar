package enumsforcarparts;
public enum Wheel {
        STANDARD("Standard Wheel", 150),
        LOW_PROFILE("Low-Profile Wheel", 200),
        OFF_ROAD("Off-Road Wheel", 250),
        STEEL("Steel Wheel", 100),
        ALLOY("Alloy Wheel", 300),
        FORGED("Forged Wheel", 500),
        MULTI_SPOKE("Multi-Spoke Wheel", 350),
        MAGNESIUM("Magnesium Wheel", 700),
        CARBON_FIBER("Carbon Fiber Wheel", 1000),
        PERFORMANCE("Performance Wheel", 400),
        WINTER("Winter Wheel", 180),
        TRACK("Track Wheel", 600),
        CUSTOM("Custom Wheel", 450);

        private final String displayName;
        private final int price;

        Wheel(String displayName, int price) {
            this.displayName = displayName;
            this.price = price;
        }

        public String getDisplayName() {
            return displayName;
        }

        public int getPrice() {
            return price;
        }
    }

