package com.example.dsjava.structural.adapter;

import com.example.dsjava.structural.adapter.model.XmlData;

/**
 * Adapter: Enables objects with incompatible interfaces to collaborate with one another
 * Creates a middle layer that serves as a translator
 * Uses Inheritance and Composition
 * The adapting behavior is separated, and we can introduce new adapters without breaking existing code
 * Applies Single Responsibility and Open/Closed Principles
 */
public class Client {

    final static XmlData xmlData = new XmlData();
    public static void main(String[] args) {
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(xmlData);

        FancyUIService fancyUIService = new FancyUIService();
        FancyUiServiceAdapter fancyUiServiceAdapter = new FancyUiServiceAdapter(fancyUIService);
        fancyUiServiceAdapter.displayMenus(xmlData);
    }
}
