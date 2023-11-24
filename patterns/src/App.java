import builder.FastFoodMeal;

public class App {
    public static void main(String[] args) throws Exception {

        /***
         * The Builder pattern is a creational design pattern that lets you construct
         * complex objects step by step. The pattern allows you to produce different
         * types and representations of an object using the same construction code.
         * 
         * The Builder pattern suggests that you extract the object construction code
         * out of its own class and move it to separate objects called builders.
         * 
         * The pattern organizes object construction into a set of steps (buildFries,
         * buildBurger, buildDrink, etc.). To create an object, you execute a series of
         * these steps on a builder object. The important part is that you don’t need to
         * call all of the steps. You can call only those steps that are necessary for
         * producing a particular configuration of an object.
         */
        FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fries")
                .andMain("CheeseBurguer")
                .forDrink("Coke")
                .thatsAll();

        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMeal.Builder("Fries").thatsAll();
        System.out.println(justFries);

        FastFoodMeal heartAtackCombo = new FastFoodMeal.Builder("Large Fries")
                .andMain("Monster Burguer")
                .forDrink("Milk Shake")
                .andDessert("Fudge Cake")
                .andGift("2 Kilograms")
                .thatsAll();
        System.out.println(heartAtackCombo);
    }
}
