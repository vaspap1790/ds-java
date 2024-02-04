package com.example.dsjava.creational.builder;
import com.example.dsjava.creational.builder.model.Car;
import com.example.dsjava.creational.builder.model.Car.CarBuilder;

public class CarFactory {

    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder carBuilder = new CarBuilder();

        director.buildBugatti(carBuilder);
        Car bugatti = carBuilder.build();
        System.out.println(bugatti);

        director.buildLambo(carBuilder);
        Car lambo = carBuilder.build();
        System.out.println(lambo);

        Car ferrari = director.buildFerrariFunctional();
        System.out.println(ferrari);
    }

}
