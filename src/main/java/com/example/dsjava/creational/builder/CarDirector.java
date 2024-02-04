package com.example.dsjava.creational.builder;
import com.example.dsjava.creational.builder.model.Car;
import com.example.dsjava.creational.builder.model.Car.CarBuilder;

/**
 * Optional
 * Can define the order in which we should call the construction steps
 * Can have various reusable construction routines
 * Can completely hide the details of the object construction from the client
 */
public class CarDirector {

    public void buildBugatti(CarBuilder builder) {
        builder
            .withBrand("Bugatti")
            .withColor("Blue")
            .withNbrOfDoors(2)
            .withEngine("8L")
            .withHeight(115);
    }

    public void buildLambo(CarBuilder builder) {
        builder
            .withBrand("Lamborghini")
            .withModel("Aventador")
            .withColor("Yellow")
            .withHeight(120);
    }

    public Car buildFerrariFunctional() {
        return Car.carFunctionalBuilder()
                .withHeight(2)
                .withBrand("Ferrari")
                .withModel("Portofino")
                .withNoColor()
                .withNoEngine()
                .withNbrOfDoors(2);
    }
}
