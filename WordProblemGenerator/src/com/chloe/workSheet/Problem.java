package com.chloe.workSheet;

import com.chloe.information.Information;
import com.chloe.workSheet.operator.Operator;
import com.chloe.workSheet.operator.OperatorFactory;
import com.chloe.util.Utility;

import java.util.Scanner;

public class Problem {
    private OperatorFactory operatorFactory;
    private Information information;
    private String problem;
    private double answer;
    private Operator operator;

    public Problem(Information information) {
        this.information = information;
        operatorFactory = new OperatorFactory(this.information);
    }

    public void createProblem(int type) {
        operator = operatorFactory.createOperator(type);
        problem = operator.createWP();
    }

    public void solve() {
        System.out.print(problem + "/n" + Utility.WRITE_ANWSER);

        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextDouble();
    }

    public boolean isCorrect() {
        return operator.isCorrect(answer);
    }
}
