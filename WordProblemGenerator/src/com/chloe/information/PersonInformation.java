package com.chloe.information;

import com.chloe.Utility;

public class PersonInformation extends Information{

    public PersonInformation(Information component) {
        this.component = component;
    }
    public PersonInformation() {}

    @Override
    public void setInformation() {
        System.out.println(Utility.WRITE_PERSON + Utility.Q_MEAN);

        informations.put("Person", inputInformation());

        if (component != null) component.setInformation();
    }
}
