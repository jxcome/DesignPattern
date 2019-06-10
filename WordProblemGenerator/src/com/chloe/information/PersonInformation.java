package com.chloe.information;

import com.chloe.util.Utility;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonInformation extends Information{

    public PersonInformation(Information component) {
        this.component = component;
    }
    public PersonInformation() {}

    @Override
    public void setInformation() {
        System.out.println(Utility.WRITE_PERSON + Utility.Q_MEAN);

        informations.put("Person", initInformation());

        if (component != null) component.setInformation();
    }

//    @Override
//    public HashMap<String, String> getRandomInfomation() {
//        ArrayList<String> persons = informations.get("Person");
//        int randIdx = (int)(Math.random() * informations.size());
//
//        randomInformation.put("Person", persons.get(randIdx));
//
//
//        if (component != null)
//            randomInformation.putAll(component.getRandomInfomation());
//
//        return randomInformation;
//    }
}
