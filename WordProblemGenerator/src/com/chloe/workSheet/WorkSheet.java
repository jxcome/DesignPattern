package com.chloe.workSheet;

import java.util.ArrayList;

public class WorkSheet {
    private ArrayList<Problem> workSheet = new ArrayList<>();
    private int score = 0;

    public WorkSheet(ArrayList<Problem> workSheet) {
        this.workSheet.addAll(workSheet);
    }

    public ArrayList<Problem> getWorkSheet() {
        return workSheet;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
