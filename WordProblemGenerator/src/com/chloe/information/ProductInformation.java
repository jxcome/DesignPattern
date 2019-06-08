package com.chloe.information;

import com.chloe.Utility;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductInformation extends Information{
    private Information component;

    public ProductInformation(Information component) {
        this.component = component;
    }
    public ProductInformation() {}

    @Override
    public void setInformation() {
        System.out.println(Utility.WRITE_PRODUCT + Utility.Q_MEAN);

        informations.put("Product", inputInformation());

        if (component != null) component.setInformation();
    }

    @Override
    public HashMap<String, String> getRandomInfomation() {
        ArrayList<String> products = informations.get("Product");
        int randIdx = (int)(Math.random() * informations.size());

        randomInformation.put("Product", products.get(randIdx));


        if (component != null)
            randomInformation.putAll(component.getRandomInfomation());

        return randomInformation;
    }
}
