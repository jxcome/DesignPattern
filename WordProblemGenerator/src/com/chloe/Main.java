package com.chloe;

import com.chloe.information.Information;
import com.chloe.information.PersonInformation;
import com.chloe.information.ProductInformation;
import com.chloe.workSheet.operator.Operator;
import com.chloe.workSheet.operator.OperatorFactory;
import com.chloe.util.Utility;

public class Main {

    public static void main(String[] args) {
        Information information = new PersonInformation(new ProductInformation());
        information.setInformation();

        OperatorFactory operatorFactory = new OperatorFactory(information);

        Operator operator1 = operatorFactory.createOperator(Utility.SUM);
        System.out.println(operator1.createWP());

        Operator operator2 = operatorFactory.createOperator(Utility.SUB);
        System.out.println(operator2.createWP());

        Operator operator3 = operatorFactory.createOperator(Utility.MUL);
        System.out.println(operator3.createWP());

        Operator operator4 = operatorFactory.createOperator(Utility.DIV);
        System.out.println(operator4.createWP());
    }
}
