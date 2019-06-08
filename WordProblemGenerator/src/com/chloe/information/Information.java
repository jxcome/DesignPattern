package com.chloe.information;

import com.chloe.Utility;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

// Decorator Pattern
public abstract class Information {
    Information component;
    HashMap<String, Vector<String>> informations = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public abstract void setInformation();

    public HashMap<String, Vector<String>> getInformation() {
        if (component != null) {
            informations.putAll(component.getInformation());
        }

        return informations;
    }

    Vector<String> inputInformation() {
        String input = "init";
        Vector<String> inputs = new Vector<>();

        while(true) {
            input = scanner.nextLine();
            if (input.equals(Utility.QUIT)) break;

            inputs.add(input);
        }

        return inputs;
    }
}
