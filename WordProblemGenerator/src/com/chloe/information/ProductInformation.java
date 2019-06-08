package com.chloe.information;

import com.chloe.Utility;

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
}
