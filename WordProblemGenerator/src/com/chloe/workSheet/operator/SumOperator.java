package com.chloe.workSheet.operator;

import com.chloe.util.Utility;
import com.chloe.information.Information;
import com.chloe.workSheet.template.SumTemplate;
import com.chloe.workSheet.template.Template;

import java.util.ArrayList;

public class SumOperator extends Operator{
    public SumOperator(Information information) {
        super(information);
    }

    @Override
    public String createWP() {
        setInformations();

        Template template = new SumTemplate();
        ArrayList<String> templates = template.getTemplate();

        int randIdx = (int)(Math.random() * templates.size());

        String wordProblem = templates.get(randIdx);
        int numIdx = 0;

        for(String[] oldString: Utility.OLD_STRINGS) {
            randIdx = (int)(Math.random() * informationMap.get(oldString[1]).size());
            wordProblem = wordProblem.replace(oldString[0], informationMap.get(oldString[1]).get(randIdx));

            if (oldString[1].equals("Value")) {
                values[numIdx++] = Integer.parseInt(informationMap.get(oldString[1]).get(randIdx));
            }
        }

        return wordProblem;
    }

    @Override
    public boolean isCorrect(double answer) {
        if (answer == (values[0] + values[1])) return true;
        else return false;
    }
}
