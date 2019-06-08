package com.chloe.workSheet;

import java.util.ArrayList;

public class WorkSheet {
    private ArrayList<Problem> workSheet = new ArrayList<>();
    private int score = 0;

    public WorkSheet(ArrayList<Problem> workSheet) {
        this.workSheet.addAll(workSheet);
    }

    public void solveWorkSheet() {
        for(Problem problem: workSheet) {
            problem.solve();
        }
    }

    public ArrayList<Problem> getWorkSheet() {
        return workSheet;
    }

    private void scoreWorkSheet() {
        for(Problem problem: workSheet) {
            if (problem.isCorrect()) score++;
        }
    }

    public int getScore() {
        return score;
    }
}
