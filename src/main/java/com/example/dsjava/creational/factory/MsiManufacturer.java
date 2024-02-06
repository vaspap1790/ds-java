package com.example.dsjava.creational.factory;

public class MsiManufacturer extends Manufacturer {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
