package com.example.dsjava.creational.builder.model;

import java.util.StringJoiner;

/**
 * Allows producing many different representations of an object using the same construction process
 * Separates the construction of a complex object from its representation
 * Use case: when an object has a large number of optional parameters or configurations,
 * to avoid a constructor with too many parameters
 * In this example, there are two builders who implement the same Builder interface
 */
public class Meal {
    private final String starter;
    private final String mainCourse;
    private final String dessert;
    private final String drink;

    private Meal(String starter, String mainCourse, String dessert, String drink) {
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drink = drink;
    }


    public String getStarter() { return starter; }

    public String getMainCourse() { return mainCourse; }

    public String getDessert() { return dessert; }

    public String getDrink() { return drink; }

    @Override
    public String toString() {
        return new StringJoiner(", ", Meal.class.getSimpleName() + "[", "]")
                .add("starter='" + starter + "'")
                .add("mainCourse='" + mainCourse + "'")
                .add("dessert='" + dessert + "'")
                .add("drink='" + drink + "'")
                .toString();
    }

    public interface MealBuilder {
        void addStarter();
        void addMainCourse();
        void addDessert();
        void addDrink();
    }

    public static class VeganMealBuilder implements MealBuilder {
        private String starter;
        private String mainCourse;
        private String dessert;
        private String drink;

        public void addStarter() {
            this.starter = Starter.SALAD.name();
        }

        public void addMainCourse() {
            this.mainCourse = MainCourse.VEGGIE_STIR_FRY.name();
        }

        public void addDessert() {
            this.dessert = Dessert.VEGAN_PUDDING.name();
        }

        public void addDrink() {
            this.drink = Drink.VEGAN_SHAKE.name();
        }

        public Meal build(){ return new Meal(starter, mainCourse, dessert, drink); }
    }

    public static class HealthyMealBuilder implements MealBuilder {
        private String starter;
        private String mainCourse;
        private String dessert;
        private String drink;

        public void addStarter() {
            this.starter = Starter.SALAD.name();
        }

        public void addMainCourse() {
            this.mainCourse = MainCourse.GRILLED_CHICKEN.name();
        }

        public void addDessert() {
            this.dessert = Dessert.FRUIT_SALAD.name();
        }

        public void addDrink() {
            this.drink = Drink.WATER.name();
        }

        public Meal build(){ return new Meal(starter, mainCourse, dessert, drink); }
    }
}
