package com.chloe;

import com.chloe.information.Information;
import com.chloe.information.PersonInformation;
import com.chloe.information.ProductInformation;
import com.chloe.problem.operator.Operator;
import com.chloe.problem.operator.OperatorFactory;
import com.chloe.util.Utility;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Information information = new PersonInformation(new ProductInformation());
        information.setInformation();

        OperatorFactory operatorFactory = new OperatorFactory(information);

        Operator operator = operatorFactory.createOperator(Utility.SUM);
        System.out.println(operator.createWP());
    }
}
