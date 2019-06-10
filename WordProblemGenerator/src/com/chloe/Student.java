package com.chloe;

import com.chloe.workSheet.Problem;
import com.chloe.workSheet.WorkSheet;

import java.util.ArrayList;

public class Student {
    ArrayList<WorkSheet> workSheets = new ArrayList<>();

    public void enrollWorkSheet(WorkSheet newWorkSheet) {
        workSheets.add(newWorkSheet);
    }

    public void solveWorkSheet() {
        ArrayList<Problem> workSheet = workSheets.get(workSheets.size() -1).getWorkSheet();

        int score = 0;
        for(Problem problem: workSheet) {
            problem.solve();

            if (problem.isCorrect()) score++;
        }

        workSheets.get(workSheets.size() -1).setScore(score);
    }
}
