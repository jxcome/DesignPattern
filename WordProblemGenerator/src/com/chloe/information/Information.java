package com.chloe.information;

import com.chloe.display.ConsoleInterface;
import com.chloe.util.Utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Decorator Pattern
public abstract class Information {
    Information component;
    HashMap<String, ArrayList<String>> informations = new HashMap<>();
//    HashMap<String, String> randomInformation = new HashMap<>();

    public abstract void setInformation();
//    public abstract HashMap<String, String> getRandomInfomation();

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
