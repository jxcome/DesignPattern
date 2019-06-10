package com.chloe.workSheet;

import com.chloe.display.ConsoleInterface;
import com.chloe.workSheet.operator.Operator;
import com.chloe.util.Utility;

public class Problem {
    private String problem;
    private double answer;
    private Operator operator;

    public Problem(String problem, Operator operator) {
        this.problem = problem;
        this.operator = operator;
    }


    public void solve() {
        System.out.print("\n" + problem + "\n" + Utility.WRITE_ANWSER);

        answer = ConsoleInterface.getInstance().getAnswer();
    }

    public boolean isCorrect() {
        return operator.isCorrect(answer);
    }
}
