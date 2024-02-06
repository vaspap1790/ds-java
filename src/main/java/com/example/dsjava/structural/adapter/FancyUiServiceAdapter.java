package com.example.dsjava.structural.adapter;

import com.example.dsjava.structural.adapter.model.JsonData;
import com.example.dsjava.structural.adapter.model.XmlData;

/**
 * Adapter wraps the Target and implements the Client interface
 */
public class FancyUiServiceAdapter implements IMultiRestoApp {

    private final FancyUIService fancyUIService;

    public FancyUiServiceAdapter(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        fancyUIService.displayMenus(convertXMLtoJSON(xmlData));
    }

    private JsonData convertXMLtoJSON(XmlData xmlData){
        // logic to convert
        return new JsonData();
    }
}
