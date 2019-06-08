package com.chloe.workSheet.template;

import java.util.ArrayList;

public abstract class Template {
    ArrayList<String> sentences = new ArrayList<>();

    public abstract void addTemplate();

    public ArrayList<String> getTemplate() {
        return sentences;
    }
}
