package com.example.dsjava.creational.builder;

import com.example.dsjava.creational.builder.model.Meal;
import com.example.dsjava.creational.builder.model.Meal.VeganMealBuilder;
import com.example.dsjava.creational.builder.model.Meal.HealthyMealBuilder;
public class Restaurant {

    public static void main(String[] args) {
        MealDirector director = new MealDirector();
        VeganMealBuilder veganMealBuilder = new VeganMealBuilder();
        HealthyMealBuilder healthyMealBuilder = new HealthyMealBuilder();

        director.constructVeganMeal(veganMealBuilder);
        Meal veganMeal = veganMealBuilder.build();
        System.out.println(veganMeal);

        director.constructHealthyMeal(healthyMealBuilder);
        Meal healthyMeal = healthyMealBuilder.build();
        System.out.println(healthyMeal);
    }

}
