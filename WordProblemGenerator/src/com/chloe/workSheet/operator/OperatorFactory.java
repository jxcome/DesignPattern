package com.chloe.workSheet.operator;

import com.chloe.information.Information;
import com.chloe.util.Utility;

public class OperatorFactory {
    private Information information;

    public OperatorFactory(Information information) {
        this.information = information;
    }

    public Operator createOperator(String type) {
        Operator operator;

        switch (type) {
            case Utility.SUM:
                operator = new SumOperator(information);
                break;
            case Utility.SUB:
                operator = new SubOperator(information);
                break;
            case Utility.MUL:
                operator = new MulOperator(information);
                break;
            case Utility.DIV:
                operator = new DivOperator(information);
                break;
            default: operator = new SumOperator(information);
                break;
        }



        return operator;
    }
}
