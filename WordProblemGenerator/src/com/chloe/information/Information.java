package com.chloe.information;

import com.chloe.display.ConsoleInterface;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Information {
    Information component;
    HashMap<String, ArrayList<String>> informations = new HashMap<>();

    public abstract void setInformation();

    public HashMap<String, ArrayList<String>> getInformation() {
        if (component != null) {
            informations.putAll(component.getInformation());
        }

        return informations;
    }

    ArrayList<String> initInformation() {
        ArrayList<String> input = ConsoleInterface.getInstance().getInformation();

        return input;
    }


}
