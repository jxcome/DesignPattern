package com.chloe.problem.operator;

import com.chloe.information.Information;
import com.chloe.util.Utility;

public class OperatorFactory {
    private Information information;

    public OperatorFactory(Information information) {
        this.information = information;
    }

    public Operator createOperator(int type) {
        Operator operator;

        switch (type) {
            case Utility.SUM:
                operator = new SumOperator(information);
                break;
            default: operator = new SumOperator(information);
                break;
        }

        return operator;
    }
}
