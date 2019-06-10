package com.chloe.workSheet.operator;

import com.chloe.information.Information;
import com.chloe.workSheet.template.DivTemplate;
import com.chloe.workSheet.template.Template;
import com.chloe.util.Utility;

import java.util.ArrayList;

public class DivOperator extends Operator{
    public DivOperator(Information information) {
        super(information);
    }

    @Override
    public String createWP() {
        setInformations();

        Template template = new DivTemplate();
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
        return answer == (values[0] / values[1]);
    }
}
