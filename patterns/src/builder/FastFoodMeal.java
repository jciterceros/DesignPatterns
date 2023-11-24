package builder;

public class FastFoodMeal {
    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    /***
     * The Builder pattern is a creational design pattern that lets you construct
     * complex objects step by step. The pattern allows you to produce different
     * types and representations of an object using the same construction code.
     * 
     * @param drink
     * @param main
     * @param side
     * @param dessert
     * @param gift
     * @return none
     */
    public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
        this.gift = gift;
    }

    /**
     * Getter getDrink
     * 
     * @param none
     * @return drink
     */
    public String getDrink() {
        return drink;
    }

    /**
     * Getter getMain
     * 
     * @param none
     * @return main
     */
    public String getMain() {
        return main;
    }

    /**
     * Getter getSide
     * 
     * @param none
     * @return side
     */
    public String getSide() {
        return side;
    }

    /**
     * Getter getDessert
     * 
     * @param none
     * @return dessert
     */
    public String getDessert() {
        return dessert;
    }

    /**
     * Getter getGift
     * 
     * @param none
     * @return gift
     */
    public String getGift() {
        return gift;
    }

    /**
     * Override toString
     * 
     * @param none
     * @return formated String with all the attributes: drink, main, side,
     *         dessert, gift
     */
    @Override
    public String toString() {
        return "FastFoodMeal [drink=" + drink + ", main=" + main + ", side=" + side + ", dessert=" + dessert + ", gift="
                + gift + "]";
    }

    /**
     * Builder inner class for FastFoodMeal
     *
     */
    public static class Builder {
        // Mandatory
        private String side;

        // Optionals
        private String drink;
        private String main;
        private String dessert;
        private String gift;

        /**
         * Builder constructor
         * 
         * @param side
         * @return none
         */
        public Builder(String side) {
            this.side = side;
        }

        /**
         * Builder forDrink
         * 
         * @param
         * @return this
         */
        public Builder forDrink(String drink) {
            this.drink = drink;
            return this;
        }

        /**
         * Builder andMain
         * 
         * @param
         * @return this
         */
        public Builder andMain(String main) {
            this.main = main;
            return this;
        }

        /**
         * Builder andDessert
         * 
         * @param
         * @return this
         */
        public Builder andDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        /**
         * Builder andGift
         * 
         * @param
         * @return this
         */
        public Builder andGift(String gift) {
            this.gift = gift;
            return this;
        }

        /**
         * Builder thatsAll
         * 
         * @param none
         * @return new FastFoodMeal
         */
        public FastFoodMeal thatsAll() {
            return new FastFoodMeal(drink, main, side, dessert, gift);
        }
    }
}
