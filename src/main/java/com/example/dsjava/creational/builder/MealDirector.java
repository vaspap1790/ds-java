package com.example.dsjava.creational.builder;

import com.example.dsjava.creational.builder.model.Meal.MealBuilder;

/**
 * Optional
 * Can define the order in which we should call the construction steps
 * Can have various reusable construction routines
 * Can completely hide the details of the object construction from the client
 */
public class MealDirector {

    public void constructVeganMeal(MealBuilder mealBuilder){
        mealBuilder.addStarter();
        mealBuilder.addMainCourse();
        mealBuilder.addDessert();
        mealBuilder.addDrink();
    }
    public void constructHealthyMeal(MealBuilder mealBuilder){
        mealBuilder.addStarter();
        mealBuilder.addMainCourse();
        mealBuilder.addDessert();
        mealBuilder.addDrink();
    }
}
