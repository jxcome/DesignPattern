package com.chloe;

import com.chloe.util.Utility;
import com.chloe.workSheet.Problem;
import com.chloe.workSheet.WorkSheet;

import java.util.ArrayList;

public class Student {
    private ArrayList<WorkSheet> workSheets = new ArrayList<>();

    public void enrollWorkSheet(WorkSheet newWorkSheet) {
        workSheets.add(newWorkSheet);
    }

    public void solveWorkSheet() {
        ArrayList<Problem> workSheet = workSheets.get(workSheets.size() -1).getWorkSheet();

        System.out.print(Utility.START);

        int score = 0;
        for(Problem problem: workSheet) {
            problem.solve();

            if (problem.isCorrect()) score++;
        }

        workSheets.get(workSheets.size() -1).setScore(score);
    }

    public int getLastScore() {
        return workSheets.get(workSheets.size() -1).getScore();
    }
}
