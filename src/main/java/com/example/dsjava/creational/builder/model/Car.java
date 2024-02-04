package com.example.dsjava.creational.builder.model;

import java.util.StringJoiner;

/**
 * Allows producing many different representations of an object using the same construction process
 * Separates the construction of a complex object from its representation
 * Use case: when an object has a large number of optional parameters or configurations,
 * to avoid a constructor with too many parameters
 * In this example, there are a regular and a functional Builder
 */
public class Car {
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int nbrOfDoors;

    private Car(int height, String brand, String model, String color, String engine, int nbrOfDoors) {
        this.height = height;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.nbrOfDoors = nbrOfDoors;
    }

    public int getHeight() { return height; }

    public String getBrand() { return brand; }

    public String getModel() { return model; }

    public String getColor() { return color; }

    public String getEngine() { return engine; }

    public int getNbrOfDoors() { return nbrOfDoors; }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("height=" + height)
                .add("brand='" + brand + "'")
                .add("model='" + model + "'")
                .add("color='" + color + "'")
                .add("engine='" + engine + "'")
                .add("nbrOfDoors=" + nbrOfDoors)
                .toString();
    }

    public static final class CarBuilder {
        private int height;
        private String brand;
        private String model;
        private String color;
        private String engine;
        private int nbrOfDoors;

        public CarBuilder withHeight(int height){
            this.height = height;
            return this;
        }

        public CarBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder withNbrOfDoors(int nbrOfDoors) {
            this.nbrOfDoors = nbrOfDoors;
            return this;
        }

        public Car build() {
            return new Car(height, brand, model, color, engine, nbrOfDoors);
        }
    }

    /**
     * The motivation for using this fluent and functional style in the builder pattern is to enhance readability,
     * expressiveness and immutability in the construction of objects,
     * making the code more maintainable and easier to understand
     * It uses nested functional interfaces
     * It is more restrictive as we have to use the whole chain, if we want default values, default methods can be implemented
     */
    public interface CarFunctionalBuilder {

        WithHeight withHeight(int height);

        interface WithHeight {
            WithBrand withBrand(String brand);
        }

        interface WithBrand {
            WithModel withModel(String model);
        }

        interface WithModel {
            WithColor withColor(String color);

            // We can have default implementations
            default WithColor withNoColor() { return withColor("Default"); }
        }

        interface WithColor {
            WithEngine withEngine(String engine);

            default WithEngine withNoEngine() { return withEngine("Default"); }
        }

        interface WithEngine {
            Car withNbrOfDoors(int nbrOfDoors);
        }
    }

    public static CarFunctionalBuilder carFunctionalBuilder() {
        return height -> brand -> model -> color -> engine -> nbrOfDoors ->
                new Car(height, brand, model, color, engine, nbrOfDoors);
    }
}
