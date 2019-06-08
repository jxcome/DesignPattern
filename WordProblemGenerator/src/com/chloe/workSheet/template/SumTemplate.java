package com.chloe.workSheet.template;

import com.chloe.util.Utility;

public class SumTemplate extends Template {
    public SumTemplate() {
        addTemplate();
    }

    @Override
    public void addTemplate() {
        for (String template: Utility.SUM_TEPLATES) {
            sentences.add(template);
        }
    }
}
