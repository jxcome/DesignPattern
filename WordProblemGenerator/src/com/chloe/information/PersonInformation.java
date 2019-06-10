package com.chloe.information;

import com.chloe.util.Utility;


public class PersonInformation extends Information{

    public PersonInformation(Information component) {
        this.component = component;
    }
    public PersonInformation() {}

    @Override
    public void setInformation() {
        System.out.print(Utility.WRITE_PERSON + Utility.Q_MEAN);

        informations.put("Person", initInformation());

        if (component != null) component.setInformation();
    }
}
