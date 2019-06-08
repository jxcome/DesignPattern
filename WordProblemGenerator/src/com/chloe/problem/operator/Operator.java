package com.chloe.problem.operator;

import com.chloe.information.Information;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Operator {
//    ArrayList<String> names = new ArrayList<>();
//    ArrayList<String> products = new ArrayList<>();
//    ArrayList<String> values;

    Information information;

    String person = "";
    String product = "";

    public Operator(Information information) {
        this.information = information;
    }

    public abstract String createWP();
    public abstract boolean isCorrect();

    void setInformations() {
        HashMap<String, ArrayList<String>> informationMap = information.getInformation();
        int randIdx;

        //
        ArrayList<String> informations = informationMap.get("Person");
        randIdx = (int)(Math.random() * informations.size());

        person = informations.get(randIdx);

        informations.clear();
    }

}
