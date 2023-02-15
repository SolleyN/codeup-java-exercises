package oop;

class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish(1500, "Beef Stew", true);
        dish1.printSummary();

        Dish dish2 = new Dish(800, "Anchovies blended with Oysters", false);
        dish2.setWouldRecommend(false);
        dish2.printSummary();

        System.out.println(DishTools.flipRecommendation(dish1));
    }
}






