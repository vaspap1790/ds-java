package com.example.dsjava.creational.factory;

public class AsusManufacturer extends Manufacturer {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
