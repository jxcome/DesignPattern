package com.chloe.problem.template;

import com.chloe.util.Utility;

import java.util.ArrayList;

public class SumTemplate extends Template {
    public SumTemplate() {
        addTemplate();
    }

    @Override
    public void addTemplate() {
        for (String template: Utility.SUM_TEPLATES) {
            sentences.add(template);
        }
    }

    @Override
    public ArrayList<String> getTemplate() {
        return sentences;
    }
}
