package com.chloe.information;

import com.chloe.util.Utility;

public class ProductInformation extends Information{
    private Information component;

    public ProductInformation(Information component) {
        this.component = component;
    }
    public ProductInformation() {}

    @Override
    public void setInformation() {
        System.out.print(Utility.WRITE_PRODUCT + Utility.Q_MEAN);

        informations.put("Product", initInformation());

        if (component != null) component.setInformation();
    }
}
