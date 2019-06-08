package com.chloe.problem.template;

import java.util.ArrayList;

public abstract class Template {
    ArrayList<String> sentences = new ArrayList<>();

    public abstract void addTemplate();
    public abstract ArrayList<String> getTemplate();
}
