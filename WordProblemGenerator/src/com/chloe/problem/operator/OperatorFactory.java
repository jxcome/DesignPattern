package com.chloe.problem.operator;

import com.chloe.Utility;

public class OperatorFactory {
    public Operator createOperator(int type) {
        Operator operator;

        switch (type) {
            case Utility.SUM:
                operator = new SumOperator();
                break;
            default: operator = new SumOperator();
                break;
        }

        return operator;
    }
}
