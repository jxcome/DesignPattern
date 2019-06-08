package com.chloe.information;

import com.chloe.Utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

// Decorator Pattern
public abstract class Information {
    Information component;
    HashMap<String, ArrayList<String>> informations = new HashMap<>();
    HashMap<String, String> randomInformation = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public abstract void setInformation();
    public abstract HashMap<String, String> getRandomInfomation();

    public HashMap<String, ArrayList<String>> getInformation() {
        if (component != null) {
            informations.putAll(component.getInformation());
        }

        return informations;
    }

    ArrayList<String> inputInformation() {
        String input = "init";
        ArrayList<String> inputs = new ArrayList<>();

        while(true) {
            input = scanner.nextLine();
            if (input.equals(Utility.QUIT)) break;

            inputs.add(input);
        }

        return inputs;
    }
}
