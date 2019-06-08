package com.chloe;

import com.chloe.information.Information;
import com.chloe.information.PersonInformation;
import com.chloe.information.ProductInformation;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Information information = new PersonInformation(new ProductInformation());

        information.setInformation();

        HashMap<String, ArrayList<String>> informations = information.getInformation();
        if (informations.containsKey("Person")) {
            System.out.println("입력된 Persons");
            ArrayList<String> temp = informations.get("Person");
            for (String person: temp) {
                System.out.print(person + " ");
            }
        }
        if (informations.containsKey("Product")) {
            System.out.println("\n\n입력된 Products");
            ArrayList<String> temp = informations.get("Product");
            for (String product: temp) {
                System.out.print(product + " ");
            }
        }
    }
}
