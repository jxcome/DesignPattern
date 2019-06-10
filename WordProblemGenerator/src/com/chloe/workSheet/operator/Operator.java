package com.chloe.workSheet.operator;

import com.chloe.information.Information;
import com.chloe.workSheet.Problem;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Operator {
    Information information;
    HashMap<String, ArrayList<String>> informationMap;

    int[] values = new int[2];

    public Operator(Information information) {
        this.information = information;
    }

    public abstract Problem createWP();
    public abstract boolean isCorrect(double answer);

    void setInformations() {
        informationMap = information.getInformation();

        ArrayList<String> randNums = new ArrayList<>();
        for(int i = 0; i < 30; i++) {
            int randNum = (int)(Math.random() * 10);
            randNums.add(Integer.toString(randNum));
        }

        informationMap.put("Value", randNums);
    }

}
