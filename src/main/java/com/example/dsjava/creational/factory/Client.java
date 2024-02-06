package com.example.dsjava.creational.factory;

/**
 * Factory: Delegates the responsibility of object creation to a separate class, making the code flexible and maintainable
 * Needs an interface Product and an abstract Factory with the create method
 * Use case: Creating objects without specifying the exact class of the object that will be created
 * Leverages various coding principles:
 * - Decouples the responsibility of the object creation (Single Responsibility)
 * - Adheres to Liskov Substitution Principle and uses Polymorphism
 * - Avoids if/else or switch statements in Client code when creating the object,
 *   by just calling the create method of the desired Concrete Factory class. This way:
 *   - Adheres to Open/Closed Principle
 *   - Client does not pass any parameter to choose which object to create:
 *      - This way the Client does not know anything about the object creation (Encapsulation)
 *      - This way creation does not depend on the Client but the client depends on the abstraction to create the object (Dependency Inversion)
 *
 * Abstract Factory: Scaling up Factory, it allows producing families of related objects without specifying their concrete classes
 * Should explicitly declare an interface and createProduct method in the Factory abstract class for each distinct product
 */
public class Client {

    public static void main(String[] args) {
        Manufacturer msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();

        Manufacturer asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();
    }
}
